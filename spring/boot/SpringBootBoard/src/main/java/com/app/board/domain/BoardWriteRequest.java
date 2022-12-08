package com.app.board.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BoardWriteRequest {

    private String title;
    private String writer;
    private String content;
    private MultipartFile formFile;


    public BoardDTO toBoardDTO() {
        return BoardDTO.builder()
                .title(title)
                .content(content)
                .writer(writer)
                .build();
    }
}
