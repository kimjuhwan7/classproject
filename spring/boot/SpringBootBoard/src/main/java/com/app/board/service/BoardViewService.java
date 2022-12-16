package com.app.board.service;

import com.app.board.domain.BoardDTO;
import com.app.board.entity.Board;
import com.app.board.mapper.BoardMapper;
import com.app.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardViewService {

    @Autowired
    private BoardMapper boardMapper;

    @Autowired
    private BoardRepository boardRepository;
    public Board selectBoardDTO(int bno){
//        return boardMapper.selectByBno(bno);
        return boardRepository.findById(bno).get();
    }

}
