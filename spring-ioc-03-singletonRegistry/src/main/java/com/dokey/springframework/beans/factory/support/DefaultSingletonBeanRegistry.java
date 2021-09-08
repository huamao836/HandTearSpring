package com.dokey.springframework.beans.factory.support;

import com.dokey.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * dokey@step#singletonRegistry 第3步：添加注册单例表的默认实现
 *
 * @author: huamao836@163.com
 * @date: 2021/9/8 10:48 上午
 * @version: V1.0
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    /**
     * dokey@step#singletonRegistry 第4步：定义map用于保存单例
     */
    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    /**
     *  dokey@step#singletonRegistry 第5步：提供添加为单例的能力
     *
     * @param beanName
     * @param singletonObject
     */
    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
