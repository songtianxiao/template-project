package com.wss.templateproject.common.beans;

import lombok.Data;

import java.io.Serializable;

/**
 * @创建人 songtx
 * @创建时间 2019-05-15 22:10
 * @描述
 */
@Data
public class ResultBean<T> implements Serializable {

    /**没有登录*/
    public static final int NO_LOGIN = -1;
    /*成功*/
    public static final int SUCCESS = 0;
    /*失败*/
    public static final int FAIL = 1;
    /*未知的*/
    public static final int NO_PERMISSION = 2;

    private String msg = "success";

    private int code = SUCCESS;

    private T data;

    public ResultBean() {
    }

    public ResultBean(T data) {
        this.data = data;
    }

    public ResultBean(Throwable e) {
        this.msg = e.getMessage();
        this.code = FAIL;
    }
}
