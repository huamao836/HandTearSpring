package com.dokey.springframework.beans.factory.support;

import com.dokey.springframework.beans.BeansException;
import com.dokey.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * Bean对象实例化策略
 * 抽象实例化策略顶级接口
 * @author: huamao836@163.com
 * @date: 2021/9/8 4:56 下午
 * @version: V1.0
 */
public interface InstantiationStrategy {

    /**
     * 定义实例化范本方法
     *
     * @param beanDefinition
     * @param beanName
     * @param constructor
     * @param args
     * @return
     * @throws BeansException
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException;
}
