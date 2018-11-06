package com.ssm.controller;

import com.ssm.model.ClassInfo;
import com.ssm.service.IClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/classController")
public class ClassController {
    @Autowired
    private IClassInfoService iClassInfoService;

    @RequestMapping("/showClass")
    public String showClass(long id, HttpServletRequest request){
        ClassInfo classInfo= null;
        try {
            classInfo = iClassInfoService.getedit(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.setAttribute("classinfo",classInfo);
        return "showClass";
    }

}
