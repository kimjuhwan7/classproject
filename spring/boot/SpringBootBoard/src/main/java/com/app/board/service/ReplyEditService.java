package com.app.board.service;

import com.app.board.domain.ReplyDTO;
import com.app.board.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyEditService {

    @Autowired
    private ReplyMapper replyMapper;

    public int updateReply(ReplyDTO replyDTO){
        return replyMapper.updateReply(replyDTO);
    }

}
