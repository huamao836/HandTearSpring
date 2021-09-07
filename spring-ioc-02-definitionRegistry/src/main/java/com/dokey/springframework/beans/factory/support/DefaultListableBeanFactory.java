package com.dokey.springframework.beans.factory.support;

import com.dokey.springframework.beans.BeansException;
import com.dokey.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * dokey@step#definitionRegistry 第九步:默认bean装配实现类
 *
 * @author: pengfei.li@advance.ai
 * @date: 2021/9/7 5:05 下午
 * @version: V1.0
 */

// dokey@step#definitionRegistry:第十四步:实现Bean定义注册接口
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{

    /**
     * dokey@step#definitionRegistry#第十二步： 添加map，用于存放bean定义信息
     */
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap();
    
    /**
     * dokey@step#definitionRegistry#第十步： 实现获取bean定义的具体功能
     * @param beanName
     * @return
     * @throws BeansException
     */
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) throw new BeansException("No bean named '" + beanName + "' is defined");
        return beanDefinition;
    }

    /**
     * dokey@step#definitionRegistry#第十一步： 添加bean注册功能，将注册信息放到map中
     * 
     * @param beanName
     * @param beanDefinition
     */
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}