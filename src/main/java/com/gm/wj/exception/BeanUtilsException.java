package com.gm.wj.exception;

/**
 *功能描述
 * @author JohnLuo
 * @date 2020/8/14
 * @param  * @param null
 * @return
 */
public class BeanUtilsException extends RuntimeException {

    public BeanUtilsException(String message) {
        super(message);
    }

    public BeanUtilsException(String message, Throwable cause) {
        super(message, cause);
    }
}

