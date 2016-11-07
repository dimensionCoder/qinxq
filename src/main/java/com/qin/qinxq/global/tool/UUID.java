package com.qin.qinxq.global.tool;

/**
 * Created by qinxq on 2016/11/7 23:30
 */
public class UUID {
    public static String getOne(){
        int length=36;
        String uuid="";
        for(int i=0;i<length;i++){
            if(i==8 || i==13 || i==17 || i==21){
                uuid+="-";
                continue;
            }
            uuid+=Integer.toHexString((int)Math.round(Math.random()*15));
        }
        return uuid;
    }
}
