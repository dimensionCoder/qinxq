package com.qin.qinxq.global.MD5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by qinxq on 2016/11/8 22:54
 */
public class MD5 {
    public static String getSimpleMD5(String targer) throws NoSuchAlgorithmException {
        String result="";
        MessageDigest messageDigest=null;
        messageDigest=MessageDigest.getInstance("MD5");
        messageDigest.update(targer.getBytes());
        byte[] bytes=messageDigest.digest();
        for(byte b:bytes){
            result+=Integer.toHexString(b >>> 1 & 0xf);
            result+=Integer.toHexString(b >>> 3 & 0xf);
        }
        return result;
    }
}
