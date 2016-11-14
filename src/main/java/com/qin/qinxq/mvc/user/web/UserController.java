package com.qin.qinxq.mvc.user.web;

import com.qin.qinxq.entity.baseentity.Response;
import com.qin.qinxq.entity.user.User;
import com.qin.qinxq.mvc.basemvc.web.BaseController;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
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
    public Response loginin(@RequestBody User user){
        UsernamePasswordToken token=new UsernamePasswordToken(user.getUsername(),user.getPassword());
        try {
            SecurityUtils.getSubject().login(token);
        }catch (AuthenticationException e){
            return new Response(Response.Status.ERROR,"账号或密码错误");
        }
        return new Response(Response.Status.OK,"");
    }
}
