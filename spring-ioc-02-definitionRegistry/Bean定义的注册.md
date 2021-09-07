# Bean定义的注册
bean的定义是指注册到容器中所需的基本参数，比如单例、多例、构造、属性的等，本节需要将Bean定义注册到容器中。

bean工厂中的获取bean是公共的共性的行为，所以将其抽取为接口，


Default 这个关键词就比较有意思了 在我们不知道具体类的名称或者怎么划分的时候用Default 是在合适不过了

第一步：将`BeanFactory`抽象为接口
第二步：`AbstractBeanFactory` 实现 `BeanFactory`接口，接下来就具备了 `getBean` 的能力.

第三步：定义`AbstractAutowireCapableBeanFactory` 继承 `AbstractBeanFactory` 实现创建bean能力

第四步：定义`DefaultListableBeanFactory`继承`AbstractAutowireCapableBeanFactory` 具备获取bean定义的能力，现在缺少bean定义的注册
添加注册方法，


至此bean定义的注册完成。
