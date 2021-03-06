package com.qin.qinxq.mvc.index.web;

import com.qin.qinxq.mvc.basemvc.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by qinxq on 2016/10/23 21:49
 */
@Controller
public class IndexController extends BaseController {

    @RequestMapping(value = "login")
    public String toLogin(){
        return "login/index";
    }

    @RequestMapping(value = "/")
    public String toIndex() {
        return "index/index";
    }

    @RequestMapping(value = "welcome")
    public String welcome() {
        return "welcome/index";
    }

}
