package com.qin.qinxq.entity.baseentity;

/**
 * Created by qinxq on 2016/11/14 22:44
 */
public class Response {
    private Status status;
    private Object msg;
    private Object msg_surplus;
    public Response() {
    }
    public Response(Status status) {
        this.status=status;
    }
    public Response(Status status,Object msg) {
        this(status);
        this.msg=msg;
    }

    public Response(Status status, Object msg, Object msg_surplus) {
        this.status = status;
        this.msg = msg;
        this.msg_surplus = msg_surplus;
    }

    public enum Status{
        ERROR,OK
    }
}
