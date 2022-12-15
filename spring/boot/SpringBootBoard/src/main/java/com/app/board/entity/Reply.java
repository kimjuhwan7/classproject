package com.app.board.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "tbl_reply")
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column
    private Integer rno;

    @Column
    private Integer bno;

    @Column
    private String reply;

    @Column
    private String replyer;

    @Column
    private LocalDate replyDate;

    @Column
    private LocalDate updateDate;

}
