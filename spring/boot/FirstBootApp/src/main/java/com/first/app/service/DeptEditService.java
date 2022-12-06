package com.first.app.service;

import com.first.app.domain.DeptDTO;
import com.first.app.mapper.DeptMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
@Log4j2
public class DeptEditService {

    @Autowired(required = false)
    private DeptMapper deptMapper;


    @PostMapping
    public int editDept(DeptDTO deptDTO) {

        return deptMapper.updateDept(deptDTO);
    }
}
