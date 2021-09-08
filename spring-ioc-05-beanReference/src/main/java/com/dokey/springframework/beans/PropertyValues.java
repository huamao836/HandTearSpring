package com.dokey.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * property属性
 *  dokey@step#beanReference 第3步:创建PropertyValues
 *
 * @author: huamao836@163.com
 * @date: 2021/9/8 6:17 下午
 * @version: V1.0
 */
public class PropertyValues {

    /**
     * dokey@step#beanReference 第4步: 由于PropertyValues有添加、获取等功能， 从PropertyValues 中抽取 PropertyValue
      */
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue pv : this.propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }
}
