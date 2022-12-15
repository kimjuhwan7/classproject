package com.first.app.entity;


import com.first.app.domain.ListItemDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpRepository extends JpaRepository<Emp, Integer> {

    @Query(value = "select e from Emp e join fetch e.dept")
    List<Emp> findEmpDept();

    @Query("select e from Emp e, Dept d where e.dept=d")
    List<Emp> findEmpWithDept(Pageable pageable);

    // 게시물 리스트 => 제목 [12] <= 댓글의 개수
    // 게시물 [dept], count 사원 수 데이터

    @Query(value = "select " +
            " d ,count(e)" +
            " from Emp e" +
            " left outer join Dept d" +
            " on e.dept=d " +
            " group by d"
            , countQuery = "select count(d) from Dept d")
    public Page<Object[]> listWithCnt(Pageable pageable);

    @Query("select " +
            " new com.first.app.domain.ListItemDTO(e.empno,e.ename,e.job,d.dname, d.loc)" +
            " from Emp e,Dept d" +
            " where e.dept=d")
    List<ListItemDTO> findListItem();
}
