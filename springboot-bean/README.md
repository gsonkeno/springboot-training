## springboot中bean的生命周期
- 1.执行无参构造函数
- 2.执行set方法注入属性
- 3.被实现BeanPostProcessor接口的后置处理器的postProcessBeforeInitialization方法处理
- 4.执行@PostConstruct注解的方法
- 5.执行InitializingBean接口的afterPropertiesSet方法
- 6.被实现BeanPostProcessor接口的后置处理器的postProcessAfterInitialization方法处理
- 7.执行@PreDestroy注解的方法
- 8.执行DisposableBean接口的destroy方法

参考图片

![springboot-bean](https://github.com/gsonkeno/springboot-training/blob/master/springboot-bean/doc/springboot-bean.jpg?raw=true)