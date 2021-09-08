package com.dokey.springframework.beans.factory;


/**
 * dokey@step#definitionRegistry 第1步：将beanFactory抽象为抽象工厂类
 *
 * @author: pengfei.li@advance.ai
 * @date: 2021/9/3 2:45 下午
 * @version: V1.0
 */
public interface BeanFactory {

    /**
     * 获取bean对象
     * @param beanName
     * @return
     */
    public Object getBean(String beanName) throws BeansException;
}
