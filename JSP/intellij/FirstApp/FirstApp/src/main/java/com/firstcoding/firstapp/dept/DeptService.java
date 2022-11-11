package com.firstcoding.firstapp.dept;

import com.firstcoding.firstapp.util.ConnectionUtil;
import lombok.Cleanup;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.util.List;

@Log4j2
public class DeptService {

    private DeptDao dao = new DeptDao();

    public List<Dept> getList() throws Exception  {

        log.info("DeptService getList() ...");

        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();

        List<Dept> list = dao.selectAll(conn);

        return list;
    }

}
