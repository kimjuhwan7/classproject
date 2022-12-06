package com.first.app.controller;

import com.first.app.domain.DeptDTO;
import com.first.app.service.DeptListService;
import com.first.app.service.DeptReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ex")
public class ExampleController {

    @Autowired
    private DeptReadService deptReadService;
    @Autowired
    private DeptListService deptListService;

    @GetMapping("/ex1")
    public String ex1(Model model, HttpSession session) {
        List<String> list = Arrays.asList("AAAA", "BBBB", "CCC", "DDD");

        model.addAttribute("list", list);
        model.addAttribute("dept", deptReadService.getDept(1));
        model.addAttribute("deptList", deptListService.getList());

        Map<String, DeptDTO> map = new HashMap<>();
        map.put("1", deptReadService.getDept(1));
        map.put("4", deptReadService.getDept(4));

        model.addAttribute("deptMap", map);
        session.setAttribute("loginData", "cool");

        return "ex/ex1"; //ex/ex1.html
    }
}
