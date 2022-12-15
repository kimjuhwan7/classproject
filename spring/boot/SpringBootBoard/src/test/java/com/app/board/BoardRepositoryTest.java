package com.app.board;

import com.app.board.entity.Board;
import com.app.board.entity.BoardRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@SpringBootTest
@Log4j2
public class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void findAll() {
        List<Board> list = boardRepository.findAll();
        for (Board board : list) {
            log.info(board);
        }
    }

    @Test
    public void BoardPageingTest() {
        Pageable pageable = PageRequest.of(0, 10);

        Page<Board> result = boardRepository.findAll(pageable);
        log.info("result >>> 조회항목 리스트" + result.getContent());
        log.info("result >>> 전체 게시물의 개수 " + result.getTotalElements());
        log.info("result >>> 전체 페이지의 개수 " + result.getTotalPages());
        log.info("result >>>현재 요청 페이지 번호" + result.getNumber());
        log.info("result >>>페이지당 표현할 항목의 개수 " + result.getSize());
        log.info("result >>>현재 페이지에 출력된 항목의 개수 " + result.getNumberOfElements());

    }
}
