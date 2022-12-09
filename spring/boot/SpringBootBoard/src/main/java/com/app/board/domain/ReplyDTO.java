package com.app.board.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ReplyDTO {

    private int rno;
    private int bno;
    private String reply;
    private String replyer;
    private String replydate;
    private String updatedate;
}
