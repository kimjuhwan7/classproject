package com.app.manager.controller;

import com.app.manager.domain.DeptSerachOption;
import com.app.manager.service.DeptListService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class DeptListController {
    /*전체출력 컨트롤러*/
    @Autowired
    private DeptListService deptListService;


    @RequestMapping("dept/list")
    public String getDeptList(
            DeptSerachOption serachOption,
            Model model
    ) {
        log.info("dept list...");
        model.addAttribute("deptList", deptListService.getSerchList(serachOption));
        return "dept/lists";

    }
}
