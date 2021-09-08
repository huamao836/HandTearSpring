package com.dokey.springframework.beans.factory.config;

import com.dokey.springframework.beans.PropertyValues;

/**
 * bean 定义
 *
 * @author: huamao836@163.com
 * @date: 2021/9/3 2:42 下午
 * @version: V1.0
 */
public class BeanDefinition {

    private Class beanClass;

    /**
     * dokey@step#beanReference 第3步:添加PropertyValues
     */
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    /**
     * dokey@step#beanReference 第6步: 添加带依赖及属性的构造
     *
     * @param beanClass
     * @param propertyValues
     */
    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
