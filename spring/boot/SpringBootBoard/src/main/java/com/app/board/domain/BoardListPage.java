package com.app.board.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class BoardListPage {

    // 페이지당 출력할 게시물의 개수
    private int countPerPage;
    // 현재 페이지 번호
    private int pageNum;
    // 게시물의 리스트
    private List<BoardDTO> list;
    // 전체 게시물의 개수
    private int totalCount;
    // 페이징의 시작번호
    private int startNum;
    // 페이징의 끝번호
    private int endNum;
    // 이전 버튼 출력 여부
    private boolean prev;
    // 다음 버튼 출력 여부
    private boolean next;


    public BoardListPage(int countPerPage, int pageNum, List<BoardDTO> list, int totalCount) {
        this.countPerPage = countPerPage;
        this.pageNum = pageNum;
        this.list = list;
        this.totalCount = totalCount;
        calPageInfo();
    }

    private void calPageInfo() {

        // 끝번호
        this.endNum = (int) (Math.ceil((this.pageNum * 1.0) / this.countPerPage)) * 10;
        this.startNum = this.endNum - 9;

        int realEndNum = (int) (Math.ceil((this.totalCount * 1.0) / this.countPerPage));
        /*   전체 게시글 35를 * 1.0  하면 35.0 여기에 나누기 10하면 3.5   ceil(올림)하면 4가 나옴*/


// 구간의 마지막 번호보다 실제 페이지 끝 번호가 작으면 endNum은 실제 끝 번호가 되어야 한다!!!!
        this.endNum = realEndNum < this.endNum ? realEndNum : this.endNum;

        /* 이전 구간으로 이동 가능한지    페이지 번호가 1보다 크면 이전버튼을 만들어줌        */
        this.prev = this.startNum > 1;

        /* 다음 구간으로 갈 수 있는지 확인  현제 게시글에 넘버가  진짜 게시글에 마지막 넘버면 다음버튼을 생성안함*/
        this.next = this.endNum < realEndNum;
    }

}
