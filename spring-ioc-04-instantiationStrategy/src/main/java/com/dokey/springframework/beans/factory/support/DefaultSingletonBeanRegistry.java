package com.dokey.springframework.beans.factory.support;

import com.dokey.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author: pengfei.li@advance.ai
 * @date: 2021/9/8 10:48 上午
 * @version: V1.0
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    /**
     *
     */
    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    /**
     *
     * @param beanName
     * @param singletonObject
     */
    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
