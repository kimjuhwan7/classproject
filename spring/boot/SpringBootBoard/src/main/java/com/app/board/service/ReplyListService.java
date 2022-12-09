package com.app.board.service;

import com.app.board.domain.ReplyDTO;
import com.app.board.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyListService {

    @Autowired
    private ReplyMapper replyMapper;

    public List<ReplyDTO> selectAll(int bno) {
        return replyMapper.selectAll(bno);
    }

}
