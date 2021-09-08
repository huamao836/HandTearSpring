package com.dokey.springframework.beans;

/**
 * dokey@step#beanReference 第5步:  创建PropertyValue有属性bean属性名及bean属性值
 *
 * @author: huamao836@163.com
 * @date: 2021/9/8 6:21 下午
 * @version: V1.0
 */
public class PropertyValue {
    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
