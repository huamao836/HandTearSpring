package com.dokey.springframework.beans.factory.support;

import com.dokey.springframework.beans.factory.config.BeanDefinition;

/**
 * bean定义的注册顶层接口
 * dokey@step#definitionRegistry 第12步： 将bean定义注册抽象为顶层接口，用于定义注册共同行为
 * 
 * @author: huamao836@163.com
 * @date: 2021/9/7 5:27 下午
 * @version: V1.0
 */
public interface BeanDefinitionRegistry {

    /**
     * dokey@step#definitionRegistry 第13步： 提取bean定义注册方法
     *
     * @param beanName
     * @param beanDefinition
     */
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
