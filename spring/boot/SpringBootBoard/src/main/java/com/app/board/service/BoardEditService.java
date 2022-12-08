package com.app.board.service;

import com.app.board.domain.BoardDTO;
import com.app.board.domain.BoardEditRequest;
import com.app.board.mapper.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.UUID;

@Log4j2
@Service
public class BoardEditService {

    @Autowired
    private BoardMapper boardMapper;

    public int edit(BoardEditRequest boardEditRequest) {
        MultipartFile file = boardEditRequest.getFormFile();
        File saveDir = null;
        String newFileName = null;

//새로운 파일을 저장

        //조건에 맞으면 파일 저장처리
        if (file != null && !file.isEmpty() && file.getSize() > 0) {

            String absolutePath = new File("").getAbsolutePath();
            log.info("파일패치" + absolutePath);
            //만들어질 폴더이름
            String path = "photo";
            saveDir = new File(absolutePath, path);

            // 폴더가 존재하지 않으면 생성
            if (!saveDir.exists()) {
                saveDir.mkdir();//폴더 생성
                log.info(">>>>>>>photo dir 생성");
            }
            //난수 발생
            String uuid = UUID.randomUUID().toString();
            //난수 + 파일이름을 변수에 저장하여 새로운 파일의 이름을 생성
            newFileName = uuid + file.getOriginalFilename();

            //새로운 저장 파일의 경로
            File newFile = new File(saveDir, newFileName);

            try {
                //파일 저장
                file.transferTo(newFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        BoardDTO boardDTO = boardEditRequest.toBoardDTO();
        if (newFileName != null) {
            boardDTO.setPhoto(newFileName);
        }

        int result = 0;
        try {
            //db update
            result = boardMapper.update(boardDTO);

            // 새로운 파일이 저장되고 이전 파일이 존재한다면 ! -> 이전 파일을 삭제
            String oldFileName = boardEditRequest.getOldFile();
            if (newFileName != null && oldFileName != null && !oldFileName.trim().isEmpty()) {
                File delOldFile = new File(saveDir, oldFileName);
                if (delOldFile.exists()) {
                    delOldFile.delete();

                }
            }
        } catch (SQLException e) {
            if (newFileName != null) {
                //파일 폴더 안에 추가한 파일 이름을 찾아서 delFile에 넣음
                File delFile = new File(saveDir, newFileName);
                if (delFile.exists()) {
                    //파일 삭제
                    delFile.delete();
                }
            }
        }


        return result;
    }
}
