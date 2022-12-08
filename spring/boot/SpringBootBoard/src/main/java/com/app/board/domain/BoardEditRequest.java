package com.app.board.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class BoardEditRequest {


    private int bno;
    private int curpageNum;
    private String title;
    private String writer;
    private String content;
    private String oldFile;
    private MultipartFile formFile;

    public BoardDTO toBoardDTO(){
        return BoardDTO.builder()
                .bno(bno)
                .writer(writer)
                .title(title)
                .content(content)
                .build();
    }
}
