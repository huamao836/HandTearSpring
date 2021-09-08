package com.dokey.springframework.beans.factory.config;

/**
 * bean 定义
 *
 * @author: huamao836@163.com
 * @date: 2021/9/3 2:42 下午
 * @version: V1.0
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
