package com.app.board.controller.board;

import com.app.board.domain.ReplyDTO;
import com.app.board.service.ReplyDeleteService;
import com.app.board.service.ReplyInsertService;
import com.app.board.service.ReplyListService;
import com.app.board.service.ReplyReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Log4j2
@RestController
@RequestMapping("/reply")
public class ReplyRestController {
    @Autowired
    private ReplyListService replyListService;


    @Autowired
    private ReplyReadService replyReadService;
    @Autowired
    private ReplyInsertService replyInsertService;

    @Autowired
    private ReplyDeleteService replyDeleteService;

    //get /reply => list
    @GetMapping(value = "/{bno}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ReplyDTO>> selectList(@PathVariable("bno") int bno) {

        List<ReplyDTO> list = replyListService.selectAll(bno);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    //post/reply => reply
    @PostMapping
    public ResponseEntity<ReplyDTO> insertReply(
            @RequestBody ReplyDTO replyDTO) {
        log.info("insert 전 :" + replyDTO);//rno값이 갱신된 데이터

        replyInsertService.insertReply(replyDTO);

        log.info("insert 후 :" + replyDTO);//rno값이 갱신된 데이터

        replyDTO.setUpdatedate(LocalDate.now().toString());
        return new ResponseEntity<>(replyReadService.selectByRno(replyDTO.getRno()), HttpStatus.OK);
    }

    //put /reply/{rno} => reply


    // delete / reply/{rno} => 0 / 1, success, fail
    @DeleteMapping("/{rno}")
    public ResponseEntity<Integer> delete(
            @PathVariable("rno") int rno
    ) {
        return new ResponseEntity<>(replyDeleteService.deleteByRno(rno), HttpStatus.OK);
    }