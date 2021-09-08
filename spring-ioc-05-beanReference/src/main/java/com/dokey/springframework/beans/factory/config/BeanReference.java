package com.dokey.springframework.beans.factory.config;

/**
 * dokey@step#beanReference 第8步：添加bean依赖的封装 在spring中其实是个接口
 *
 * @author: huamao836@163.com
 * @date: 2021/9/8 6:30 下午
 * @version: V1.0
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
