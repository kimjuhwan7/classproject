package com.todo.todospring.service;

import com.todo.todospring.domain.Member;
import com.todo.todospring.domain.MemberRegRequest;
import com.todo.todospring.mapper.MemberMapper;
import com.todo.todospring.util.ConnectionProvider;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;

@Service
@Log4j2
public class MemberRegServiceImpl implements MemberRegService {

    @Autowired(required = false)
    private MemberMapper memberMapper;

    private static String getDirRealpath(HttpServletRequest request, String dirURI) {
        String dirRealpath = request.getSession().getServletContext().getRealPath(dirURI);
        return dirRealpath;
    }


    // 사용자 요청 데이터를 받고, 파일 업로드 처리, Dao  insert요청
    /*사용자 입력 이미지 파일 확인 후 업로드 처리*/

    @Override
    @Transactional
    public int memberReg(MemberRegRequest regRequest, HttpServletRequest request) throws Exception {
        String newFileName = null;


        // 파일 업로드 처리 여부 체크
        if (regRequest.getUphoto() != null && !regRequest.getUphoto().isEmpty() && regRequest.getUphoto().getSize() > 0) {
            // uri 정의 : 저장할 폴더
            String dirURI = "/uploadfile/member";
            // 시스템의 절대 경로
            String dirRealpath = getDirRealpath(request, dirURI);
            log.info("==" + dirRealpath);

            newFileName = System.nanoTime() + regRequest.getUphoto().getOriginalFilename();
            log.info(newFileName);
            // 저장
            try {
                regRequest.getUphoto().transferTo(new File(dirRealpath, newFileName));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        /*이미지 저장이 완료 후 세션에 저장할 데이터 분류*/
        Member member = regRequest.toMember();

        if (newFileName != null) {
            member.setUphoto(newFileName);
        }
        log.info(member);

        @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();

        return memberMapper.insertMember(member);
    }


    /*@Override
    public int todoReg(TodoImgDTO imgDTO, HttpServletRequest request) {
        String newImgName = null;

        *//*파일 업로드 처리 여부 체크*//*
        if (imgDTO.getIimg() != null && !imgDTO.getIimg().isEmpty() && imgDTO.getIimg().getSize() > 0) {
            *//*저장할 폴더 uri 주소*//*
            String dirURI = "/image";
            *//*시스템의 절대 경로*//*
            String dirRealpath = getDirRealpath(request, dirURI);

            *//*중복 방지를 위해 사용(시스템 나노초 + 이미지파일 이름)*//*
            newImgName = System.nanoTime() + imgDTO.getIimg().getOriginalFilename();

            //저장
            try {
                *//*위에서 만들어준 절대경로에 이미지 이름을 붙여서 이미지 주소를 만들어줌*//*
                imgDTO.getIimg().transferTo(new File(dirRealpath, newImgName));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (newImgName != null) {
            imgDTO.setIimg(newImgName);
        }


        return;
    }*/
}
