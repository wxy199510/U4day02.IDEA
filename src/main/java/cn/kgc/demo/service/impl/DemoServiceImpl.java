package cn.kgc.demo.service.impl;

import cn.kgc.demo.dao.UserDao;
import cn.kgc.demo.pojo.Users;
import cn.kgc.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Service、一般用于、业务层
//把业务层的类交由spring管理(<bean id="demoService" class="cn.kgc.demo.service.impl.DemoServiceImpl"></bean>)
//@Service、没有指定名称、默认首字母小写的类名、demoServiceImpl
//@Service(value = "a2")、指定名称、a2、也可以不写value =
@Service("a2")
public class DemoServiceImpl implements DemoService {

    //引入dao层、DI依赖注入
    //@Autowired、自动注入(<property name="userDao" ref="userDao"></property>)
    //@Autowired、可以标记在属性和set方法上、(如果标记在属性上、可以没有set方法)
    //@Autowired、一个接口只有一个实现类(a3)、属性名怎么写无所谓、按照类型匹配只有一个bean

    //@Autowired、一个接口多个实现类(a3、a4)、属性名跟组件名一致、此时属性名private UserDao a3;或者a4
    //@Autowired、一个接口多个实现类(a3、a4)、如果想要属性名跟组件名不一致、配合@Qualifier注解指定组件名
    //@Qualifier、用在接口有多个实现类(a3、a4)情况下
    //@Qualifier("a4")、表示指定注入实现类(a4)、此时属性名可以随便写(private UserDao abc;)

    //@Resource、自动注入(sun公司提供、不常用)、和@Autowired的区别
    //@Resource、默认按照名称注入、如果名称没有找到、按照类型注入、jdk提供
    //@Autowired、默认按照类型注入、如果类型有多个、按照名称注入、sprig提供
    //@Resource(name = "a3")

    @Autowired
    //@Qualifier("a4")
    private UserDao a3;

    //@Autowired 构造注入(提供有参构造)
//    @Autowired
//    public DemoServiceImpl(@Qualifier("a3") UserDao abc) {
//        this.abc = abc;
//    }

    //@Autowired、setter方法注入
//    @Autowired
//    public void setCount(@Qualifier("a4") UserDao abc) {
//        this.abc = abc;
//    }

    @Override
    public int insertUsers(Users users) {
        return a3.insertUsers(users);
    }

}
