package com.dokey.springframework.beans.factory.support;

import com.dokey.springframework.beans.BeansException;
import com.dokey.springframework.beans.factory.BeanFactory;
import com.dokey.springframework.beans.factory.config.BeanDefinition;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 创建抽象bean工厂类实现BeanFactory
 * dokey@step#singletonRegistry 第6步：抽象AbstractBeanFactory继承单例注册表默认实现
 *
 * @author: huamao836@163.com
 * @date: 2021/9/7 3:55 下午
 * @version: V1.0
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    /**
     * 第四步：获取bean如果不存在则实例化bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    public Object getBean(String beanName) throws BeansException {
        // dokey@step#singletonRegistry 第7步：默认是从容器中获取单例
        Object bean = getSingleton(beanName);
        if (null != bean) {
            return bean;
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
