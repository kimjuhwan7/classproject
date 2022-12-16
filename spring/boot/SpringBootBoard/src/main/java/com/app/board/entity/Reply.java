package com.app.board.entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
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
    private LocalDate replydate;
    @Column
    private String updatedate;

}
