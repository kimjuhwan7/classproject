package com.first.app.mapper;

import com.first.app.domain.DeptDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface
DeptMapper {

    /*전체 부서 리스트*/
    List<DeptDTO> selectAll();

    /*검색 타입과 키워드를 받아서 검색 결과를 반환*/
    /*List<DeptDTO> selectByOption(DeptSerachOption serachOption);*/

    List<DeptDTO> selectByDeptnos(List<Integer> deptnos);

    /*수정/ 상세 페이지*/
    DeptDTO selectBydeptno(int deptno);

    /*수정(변경) 처리*/
    int updateDept(DeptDTO deptDTO);

    /*삭제*/
    int deleteByDeptno(int deptno);

    /*입력*/
    int insertDept(DeptDTO deptDTO);


}
