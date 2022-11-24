package com.app.manager.mapper;

import com.app.manager.domain.DeptDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

    /*전체 부서 리스트*/
    List<DeptDTO> selectAll();

    /*수정/ 상세 페이지*/
    DeptDTO selectBydeptno(int deptno);

    /*수정(변경) 처리*/
    int updateDept(DeptDTO deptDTO);

    /*삭제*/
    int deleteByDeptno(int deptno);

    /*입력*/
    int insertDept(DeptDTO deptno);


}
