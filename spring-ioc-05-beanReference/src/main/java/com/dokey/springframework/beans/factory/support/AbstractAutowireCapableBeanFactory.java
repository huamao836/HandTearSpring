package com.dokey.springframework.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import com.dokey.springframework.beans.BeansException;
import com.dokey.springframework.beans.PropertyValue;
import com.dokey.springframework.beans.PropertyValues;
import com.dokey.springframework.beans.factory.config.BeanDefinition;
import com.dokey.springframework.beans.factory.config.BeanReference;

import java.lang.reflect.Constructor;

/**
 * 自动注入抽象类，用于实现bean的实例化
 *
 * @author: huamao836@163.com
 * @date: 2021/9/7 4:59 下午
 * @version: V1.0
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    /**
     * 默认将Cglib作为对象实例化策略
     */
    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    /**
     * 实现bean实例化功能
     *
     * @param beanName
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        Object bean = null;
        try {
            // 使用具体实例化策略
            // bean = beanDefinition.getBeanClass().newInstance();
            //添加createBeanInstance为具体实例化执行方法
            bean = createBeanInstance(beanDefinition, beanName, args);
            //dokey@step#beanReference 第1步: 实例化完成之后，如果bean对象有属性或者依赖我们需要将其赋值
            applyPropertyValues(beanName, bean, beanDefinition);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }

    /**
     * dokey@step#beanReference 第2步:将属性和依赖赋值需要从bean定义中获取property参数
     *
     * @param beanName
     * @param bean
     * @param beanDefinition
     */
    protected void applyPropertyValues(String beanName, Object bean, BeanDefinition beanDefinition) {
        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();
            for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {

                String name = propertyValue.getName();
                Object value = propertyValue.getValue();

                // dokey@step#beanReference 第7步: 由于是填充属性信息还包括了 Bean 的对象类型，也就是需要再定义一个
                // BeanReference 用于封装bean依赖，如果是依赖则需要获取对应的bean如果是属性则直接赋值
                if (value instanceof BeanReference) {
                    // A 依赖 B，获取 B 的实例化
                    BeanReference beanReference = (BeanReference) value;
                    value = getBean(beanReference.getBeanName());
                }
                // 属性填充
                BeanUtil.setFieldValue(bean, name, value);
            }
        } catch (Exception e) {
            throw new BeansException("Error setting property values：" + beanName);
        }
    }

    /**
     *  具体实例化
     *
     * @param beanDefinition
     * @param beanName
     * @param args
     * @return
     */
    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor ctor : declaredConstructors) {
            if (null != args && ctor.getParameterTypes().length == args.length) {
                constructorToUse = ctor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructorToUse, args);
    }


    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
