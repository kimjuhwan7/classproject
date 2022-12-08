package com.app.board.controller.board;

import com.app.board.domain.BoardWriteRequest;
import com.app.board.service.BoardWriteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;

@Log4j2
@Controller
@RequestMapping("/board/write")
public class BoardWriteController {

    @Autowired
    private BoardWriteService boardWriteService;


    @GetMapping
    public void writeForm() {
    }

    @PostMapping
    public String writer(BoardWriteRequest boardWriteRequest) {
        log.info("보더" + boardWriteRequest);

        /*특정경로파일 가져온다*/
        String absolutePath = new File("").getAbsolutePath();
        log.info(">>>>>>>path : " + absolutePath);

        boardWriteService.write(boardWriteRequest);
        return "redirect:/board/list";
    }

}
