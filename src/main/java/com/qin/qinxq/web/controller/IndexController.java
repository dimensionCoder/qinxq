package com.qin.qinxq.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * creat by qinxq on 2016/10/23 21:49
 */
@Controller
public class IndexController {
    @RequestMapping(value = "index")
    public String toIndex(){
        return "index";
    }
}
