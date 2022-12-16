package com.app.board.service;

import com.app.board.domain.ReplyDTO;
import com.app.board.entity.Reply;
import com.app.board.mapper.ReplyMapper;
import com.app.board.repository.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyReadService {

    @Autowired
    private ReplyMapper replyMapper;

    @Autowired
    private ReplyRepository replyRepository;

    public Reply selectByRno(int rno) {
//        return replyMapper.selectByRno(rno);
        return replyRepository.findById(rno).get();
    }


}
