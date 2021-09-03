package com.dokey.springframework.beans.config;

/**
 * bean 定义
 *
 * @author: pengfei.li@advance.ai
 * @date: 2021/9/3 2:42 下午
 * @version: V1.0
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }
}
