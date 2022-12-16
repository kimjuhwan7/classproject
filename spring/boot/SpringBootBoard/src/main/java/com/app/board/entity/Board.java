package com.app.board.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_board")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Integer bno;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private String writer;

    @Column
    private String photo;

    @Column(insertable = false, updatable = false)// 자동입력값이여서 값 입력 안하고 업뎃불가
    private LocalDate regdate;

    @Column(insertable = false)//자동입력  업데이트해야함
    private LocalDate updatedate;


}
