package com.hou.controller;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String indexPage(){
        return "index1.html";
    }

    public static void main(String[] args) {
        Integer a = 10;

        Integer b = 10;

        System.out.println(a==b);

    }

    public static int getA(){
        System.out.println("hello");
        return 1;
    }

}
