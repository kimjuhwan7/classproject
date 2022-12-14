package com.first.app.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface DeptRepository extends JpaRepository<Dept, Integer> {
    Optional<Dept> findByDeptno(Integer deptno);

    List<Dept> findByDnameOrderByLocAsc(String dname);

    List<Dept> findByDeptnoGreaterThanAndDnameLikeOrLocLikeOrderByDeptnoDesc(Integer deptno, String dname, String loc);



}
