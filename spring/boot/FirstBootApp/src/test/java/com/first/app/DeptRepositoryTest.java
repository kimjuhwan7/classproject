package com.first.app;

import com.first.app.entity.Dept;
import com.first.app.entity.DeptRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Log4j2
@SpringBootTest

public class DeptRepositoryTest {

    @Autowired
    private DeptRepository deptRepository;

    @Test
    public void jpaMothodTest() {
// 전체 리스트 반환 findAll()
        List<Dept> list1 = deptRepository.findAll();
        for (Dept dept : list1) {
            log.info(dept);
        }
        log.info(":::::::::::::::::::::::::::::::: ::::::::::::::::::::::::::::::::");

        //  정렬 기준 설정
        Sort sort = Sort.by(Sort.Direction.DESC, "deptno");
        List<Dept> list2 = deptRepository.findAll(sort);
        for (Dept dept : list2) {
            log.info(dept);
        }
        log.info(":::::::::::::::::::::::::::::::: ::::::::::::::::::::::::::::::::");

        // 검색 
        Optional<Dept> dept1 = deptRepository.findById(10);
        Dept deptData = dept1.orElse(null);
        log.info("deptData 없으면 null반환" + deptData);

        //여러개 검색
        List<Integer> nos = Arrays.asList(10, 11, 20, 30);
        List<Dept> list3 = deptRepository.findAllById(nos); //where in 연산
        for (Dept dept : list3) {
            log.info(dept);
        }
        log.info(":::::::::::::::::::::::::::::::: ::::::::::::::::::::::::::::::::");

        //insert
        Dept insertData = Dept.builder()
                .dname("기획팀")
                .loc("서울")
                .build();
//        log.info("insert 전 데이터 >>>>" + insertData);
//        Dept resultData = deptRepository.save(insertData);
//        log.info("insert 후 데이터 >>>>" + resultData);

        log.info(":::::::::::::::::::::::::::::::: ::::::::::::::::::::::::::::::::");

        // update -> save(S) 이용
        Dept editData = Dept.builder().deptno(11).dname("QA").loc("분당").build();

        log.info("수정 처리 후 데이터 >>>>>>>>" + deptRepository.save(editData));
        log.info(":::::::::::::::::::::::::::::::: ::::::::::::::::::::::::::::::::");

        // delete
//        deptRepository.deleteById(15);

        // 개수
        long count = deptRepository.count();
        log.info("전체 부서의 수 " + count);

    }

    @Test
    public void JpqlMethodTest() {
        Optional<Dept> dept1 = deptRepository.findByDeptno(10);

        log.info(">>>>>>>>>>>>" + dept1);

        log.info("");

        List<Dept> list1 = deptRepository.findByDnameOrderByLocAsc("%A%");

        for (Dept dept : list1) {
            log.info(dept);
        }
    }

}
