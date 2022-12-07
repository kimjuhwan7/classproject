package com.app.board.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BoardDTO {

    private int bno;
    private String title;
    private String content;
    private String writer;
    private String photo;
    private LocalDate regdate;
    private LocalDate updatedate;
}
