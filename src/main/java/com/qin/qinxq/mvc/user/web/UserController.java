package com.qin.qinxq.mvc.user.web;

import com.qin.qinxq.entity.user.User;
import com.qin.qinxq.mvc.basemvc.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qinxq on 2016/11/8 23:58
 */
@Controller
@RequestMapping(value = "user")
public class UserController extends BaseController {
    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public User loginin(@RequestBody User user){
        return user;
    }
}
