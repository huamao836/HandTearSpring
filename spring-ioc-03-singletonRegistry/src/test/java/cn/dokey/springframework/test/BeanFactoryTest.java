package cn.dokey.springframework.test;

import cn.dokey.springframework.test.bean.UserService;
import com.dokey.springframework.beans.factory.config.BeanDefinition;
import com.dokey.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;


/**
 * bean容器测试类
 *
 * @author: pengfei.li@advance.ai
 * @date: 2021/9/3 2:31 下午
 * @version: V1.0
 */
public class BeanFactoryTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUser();

    }
}
