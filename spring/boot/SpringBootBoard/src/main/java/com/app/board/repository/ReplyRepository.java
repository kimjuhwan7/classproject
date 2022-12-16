package com.app.board.repository;

import com.app.board.entity.Reply;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Integer> {


    // 전체 리스트 : findAll
    // 입력 : save
    // 수정 : save
    // 삭제 : deleteByRno

    @Transactional
    @Modifying
    @Query("delete from Reply r where r.rno = :rno")
    int deleteByRno( Integer rno);

    @Query("select r from Reply r where r.bno = :bno order by r.rno")
    List<Reply> findByBno(@Param("bno") Integer bno);


}
