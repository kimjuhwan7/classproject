package com.first.app.entity;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface DeptRepository extends JpaRepository<Dept, Integer> {
    Dept findByDeptno(Integer deptno);

    List<Dept> findByDnameOrderByLocAsc(String dname);

    @Query("select d from Dept d where d.loc like :loc")
    List<Dept> findByLocLike(@Param("loc") String loc);

    @Query("select d from Dept d where d.deptno between :startNum and :endNum")
    List<Dept> findByDeptnoBetween(@Param("startNum") Integer startNum, @Param("endNum") Integer endNum);


}
