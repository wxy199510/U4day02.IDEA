import cn.kgc.demo.pojo.Users;
import cn.kgc.demo.service.impl.DemoServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    private ApplicationContext app;

    @Before
    public void first() {
        app = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    @Test
    public void test01() {
        //@Component、没有指定名称、默认首字母小写的类名、users
        //从spring中获取users
        //Users users = app.getBean("users", Users.class);
        //System.out.println("users = " + users);

        //@Component(value = "a1")、指定名称、a1
        //从spring中获取users
//        Users users = app.getBean("a1", Users.class);
//        System.out.println("users = " + users);

        //测试、多例模式、看哈希地址、注释toString()
//        Users users1 = app.getBean("a1", Users.class);
//        System.out.println("users1 = " + users1);

        //测试、单例模式、懒加载、注释上面所有
    }

    @Test
    public void test02() {
        DemoServiceImpl demoService = app.getBean("a2", DemoServiceImpl.class);
        Users users = new Users();
        users.setId(10086);
        users.setUsername("王冰冰");
        System.out.println(demoService.insertUsers(users));
    }

    //@Value注入
    @Test
    public void test03() {
        DemoServiceImpl demoService = app.getBean("a2", DemoServiceImpl.class);
        Users users = app.getBean("a1", Users.class);
        System.out.println(demoService.insertUsers(users));
    }

}
