package com.dokey.springframework.beans.factory.config;

/**
 * 注册单例：
 *
 * @author: pengfei.li@advance.ai
 * @date: 2021/9/8 10:29 上午
 * @version: V1.0
 */
public interface SingletonBeanRegistry {

    /**
     *
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);
}
