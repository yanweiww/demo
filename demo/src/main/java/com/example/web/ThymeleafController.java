package com.example.web;


import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by TC20021 on 2018/10/24.
 */
@Controller
public class ThymeleafController {
    @GetMapping(value="/2")
    public String test(HttpServletRequest request){
        request.setAttribute("key","HelloWorld");

        return "2";
    }
}
