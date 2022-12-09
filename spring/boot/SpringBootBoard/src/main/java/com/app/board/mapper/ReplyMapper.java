package com.app.board.mapper;

import com.app.board.domain.ReplyDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ReplyMapper {

    @Select("select * from tbl_reply where bno=#{bno}")
    List<ReplyDTO> selectAll(int bno);

    @Select("select * fro tbl_reply where rno=#{rno}")
    ReplyDTO selectByRno(int rno);

    @Insert("insert into tbl_reply(bno,reply,replyer) values(#{bno},#{relpy},#{replyer})")
    @Options(useGeneratedKeys = true, keyProperty = "rno", keyColumn = "rno")
    int insertReply(ReplyDTO replyDTO);

    @Delete("delete from tbl_reply where rno=#{rno}")
    int deleteByRno(int rno);
}
