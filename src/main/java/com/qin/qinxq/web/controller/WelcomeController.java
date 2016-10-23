package com.qin.qinxq.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * creat by qinxq on 2016/10/23 22:16
 */
@Controller
public class WelcomeController {
    @RequestMapping(value = "/")
    public String welcome(){
        return "welcome";
    }
}
