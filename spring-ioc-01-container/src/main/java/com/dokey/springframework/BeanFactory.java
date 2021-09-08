package com.dokey.springframework;

import java.util.concurrent.ConcurrentHashMap;

/**
 * bean工厂类
 *
 * @author: huamao836@163.com
 * @date: 2021/9/3 2:45 下午
 * @version: V1.0
 */
public class BeanFactory {

    /**
     * 第一步：用来存放bean定义的map
     */
    private ConcurrentHashMap<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap();

    /**
     * 第二步：提供注册的功能
     *
     * @param beanName
     * @param beanDefination
     */
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefination) {
        beanDefinitionMap.put(beanName, beanDefination);
    }

    /**
     * 获取bean对象
     * @param beanName
     * @return
     */
    public Object getBean(String beanName) {
        return beanDefinitionMap.get(beanName).getBean();
    }
}
