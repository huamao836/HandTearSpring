package com.dokey.springframework.beans;

/**
 * 定义bean异常
 *
 * @author: huamao836@163.com
 * @date: 2021/9/3 2:28 下午
 * @version: V1.0
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
