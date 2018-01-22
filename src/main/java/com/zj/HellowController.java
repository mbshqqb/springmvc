package com.zj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HellowController {

    @RequestMapping("/hello")
    public @ResponseBody String say(HttpServletRequest request, HttpServletResponse response){
        return "hello, world! This com from spring!";
    }
}