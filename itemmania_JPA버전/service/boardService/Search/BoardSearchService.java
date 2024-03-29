package com.itemmania.service.boardService.Search;

import com.itemmania.entity.BoardEntity;
import com.itemmania.repository.BoardRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class BoardSearchService {

    @Autowired
    private BoardRepository boardRepository;

    //삽니다, 팝니다 구분하여 사용자가 입력한 게임or게임서버를 검색후 프리미엄 결과값만 출력 
    public Page<BoardEntity> getP_SearchDataCheck(Pageable pageable, String dealCheck, String gameName, String gameServerName) {

        log.info(dealCheck);
        log.info(gameName + gameServerName);

        Page<BoardEntity> P_list = boardRepository.boardP_SearchList(pageable, dealCheck, gameName, gameServerName);
        log.info("검색서비스_프리미엄" + P_list);
        return P_list;
    }

    //삽니다, 팝니다 구분하여 사용자가 입력한 게임or게임서버를 검색후 일반 결과값만 출력
    public Page<BoardEntity> getSearchDataCheck(Pageable pageable, String dealCheck, String gameName, String gameServerName) {
        log.info(dealCheck);
        log.info(gameName + gameServerName);

        Page<BoardEntity> list = boardRepository.boardSearchList(pageable, dealCheck, gameName, gameServerName);
        log.info("검색서비스_일반" + list);
        return list;
    }
}
