package com.qin.qinxq.mvc.basemvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by qinxq on 2016/10/23 21:49
 */
@Controller
public class BaseController {
    @RequestMapping(value = "index")
    public String toIndex(){
        return "index";
    }
}
