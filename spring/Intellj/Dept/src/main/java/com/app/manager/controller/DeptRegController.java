package com.app.manager.controller;

import com.app.manager.domain.DeptDTO;
import com.app.manager.service.DeptRegService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Log4j2
@Controller
@RequestMapping("/dept/register")
public class DeptRegController {
    /*입력 컨트롤러*/
    @Autowired
    private DeptRegService regService;

    @GetMapping
    public void getRegForm() {
        log.info("regForm...");
    }

    @PostMapping
    public String reg(@Valid DeptDTO deptDTO, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            log.info(bindingResult.getAllErrors());
            for (ObjectError objectError : bindingResult.getAllErrors()) {
                log.info(objectError.getCodes()[1] + " : " + objectError.getDefaultMessage());
            }
        }

        /*regService.insertDept(deptDTO);*/
//        regService.insertDepts(deptDTO);
        return "redirect:/dept/list";
    }
}
