package com.dokey.springframework.beans.factory.support;

import com.dokey.springframework.beans.BeansException;
import com.dokey.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * Bean对象实例化策略
 * dokey@step#instantiationStrategy 第1步: 抽象实例化策略顶级接口
 * @author: pengfei.li@advance.ai
 * @date: 2021/9/8 4:56 下午
 * @version: V1.0
 */
public interface InstantiationStrategy {

    /**
     * dokey@step#instantiationStrategy 第2步: 定义实例化范本方法
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