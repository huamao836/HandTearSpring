package com.dokey.springframework.beans.factory.support;

import com.dokey.springframework.beans.BeansException;
import com.dokey.springframework.beans.factory.BeanFactory;
import com.dokey.springframework.beans.factory.config.BeanDefinition;

import java.util.concurrent.ConcurrentHashMap;

/**
 * dokey@step#definitionRegistry: 第2步：创建抽象bean工厂类实现BeanFactory
 *
 * @author: pengfei.li@advance.ai
 * @date: 2021/9/7 3:55 下午
 * @version: V1.0
 */
public abstract class AbstractBeanFactory implements BeanFactory {

    /**
     * dokey@step#definitionRegistry:第3步:：用来存放bean定义的map
     */
    protected ConcurrentHashMap<String, Object> beanMap = new ConcurrentHashMap();


    /**
     * dokey@step#definitionRegistry: 第4步：获取bean如果不存在则实例化bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    public Object getBean(String beanName) throws BeansException {
        Object obj = beanMap.get(beanName);
        if (null != obj) {
            return obj;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }

    /**
     * dokey@step#definitionRegistry:第5步:获取bean定义
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * dokey@step#definitionRegistry:第6步: 创建bean
     *
     * @param beanName
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
