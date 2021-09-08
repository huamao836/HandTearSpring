package com.dokey.springframework.beans.factory.config;

/**
 * 注册单例：
 *  dokey@step#singletonRegistry 第1步:将注册单例抽象成顶层接口，即，注册单例表
 *
 * @author: pengfei.li@advance.ai
 * @date: 2021/9/8 10:29 上午
 * @version: V1.0
 */
public interface SingletonBeanRegistry {

    /**
     * dokey@step#singletonRegistry 第2步：提供获取单例能力：根据bean名称获取bean
     *
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);
}
