package com.wss.templateproject.common.exceptions;

/**
 * @创建人 songtx
 * @创建时间 2019-05-15 22:47
 * @描述 已知异常
 */
public class CheckException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public CheckException() {
    }

    public CheckException(String message) {
        super(message);
    }

    public CheckException(Throwable cause) {
        super(cause);
    }

    public CheckException(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
