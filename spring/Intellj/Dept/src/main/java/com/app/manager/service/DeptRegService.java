package com.app.manager.service;

import com.app.manager.domain.DeptDTO;
import com.app.manager.mapper.DeptMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DeptRegService {

    @Autowired(required = false)
    private DeptMapper deptMapper;

    public int  insertDept(DeptDTO deptDTO){
        return deptMapper.insertDept(deptDTO);
    }
}
