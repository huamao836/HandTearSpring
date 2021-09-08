package cn.dokey.springframework.test;

import cn.dokey.springframework.test.bean.UserDao;
import cn.dokey.springframework.test.bean.UserService;
import com.dokey.springframework.beans.PropertyValue;
import com.dokey.springframework.beans.PropertyValues;
import com.dokey.springframework.beans.factory.config.BeanDefinition;
import com.dokey.springframework.beans.factory.config.BeanReference;
import com.dokey.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;


/**
 * bean容器测试类
 *
 * @author: huamao836@163.com
 * @date: 2021/9/3 2:31 下午
 * @version: V1.0
 */
public class BeanFactoryTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.添加属性及依赖
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "dokey"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        // 3.注册bean
        // 先注册依赖userDao
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);


        // 4.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        System.out.println(userService.queryByName("dokey"));

    }
}
