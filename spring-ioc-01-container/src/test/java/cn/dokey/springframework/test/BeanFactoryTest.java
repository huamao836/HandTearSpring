package cn.dokey.springframework.test;

import cn.dokey.springframework.test.bean.UserService;
import com.dokey.springframework.BeanDefinition;
import com.dokey.springframework.BeanFactory;
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
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition1 = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition1);

        BeanDefinition beanDefinition2 = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition2);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();


    }
}
