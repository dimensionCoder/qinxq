package com.qin.qinxq.mvc.basemvc.web;

import com.qin.qinxq.global.Config;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by qinxq on 2016/10/23 21:49
 */
public abstract class BaseController {
    @RequestMapping(value = "index")
    public String defaultIndex(){
        return getUri()+"/index";
    }

    /**
     * @Description 获取当前uri
     * @return String uri
     */
    protected final String getUri(){
        String[] uris=getClass().toString().split("\\.");
        return uris[Config.PACKAGE_DEPTH+1];
    }
}
