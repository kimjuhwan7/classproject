package com.app.board.domain;

import com.app.board.entity.Board;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class BoardEditRequest {

    private int bno;
    private int curPageNum;
    private String title;
    private String writer;
    private String content;
    private String oldFile;
    private MultipartFile formFile;

    public BoardDTO toBoardDTO() {
        return BoardDTO.builder()
                .bno(bno)
                .writer(writer)
                .title(title)
                .content(content)
                .photo(oldFile)
                .build();
    }

    public Board toBoardEntity() {
        return Board.builder()
                .bno(bno)
                .writer(writer)
                .title(title)
                .content(content)
                .photo(oldFile)
                .build();
    }
}
