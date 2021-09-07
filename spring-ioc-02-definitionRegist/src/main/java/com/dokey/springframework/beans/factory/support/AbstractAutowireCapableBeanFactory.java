package com.dokey.springframework.beans.factory.support;

import com.dokey.springframework.beans.BeansException;
import com.dokey.springframework.beans.factory.config.BeanDefinition;

/**
 * dokey@step#definitionRegist 第七步:自动注入抽象类，用于实现bean的实例化
 *
 * @author: pengfei.li@advance.ai
 * @date: 2021/9/7 4:59 下午
 * @version: V1.0
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    /**
     * dokey@step#definitionRegist:第八步:实现bean实例化功能
     *
     * @param beanName
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        return bean;
    }
}
