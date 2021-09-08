package com.dokey.springframework.beans.factory;

import com.dokey.springframework.beans.BeansException;

/**
 * 将beanFactory抽象为抽象工厂类
 *
 * @author: huamao836@163.com
 * @date: 2021/9/3 2:45 下午
 * @version: V1.0
 */
public interface BeanFactory {

    /**
     * 获取bean对象
     * @param beanName
     * @return
     */
    public Object getBean(String beanName) throws BeansException;

    /**
     * 获取指定构造的bean
     *
     * @param name
     * @param args
     * @return
     * @throws BeansException
     */
    Object getBean(String name, Object... args) throws BeansException;
}
