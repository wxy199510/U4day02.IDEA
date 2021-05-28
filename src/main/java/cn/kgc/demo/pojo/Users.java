package cn.kgc.demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//TODO 用户实体类

//@Component 标记在类上、作用：创建对象(只要标记、扫描了该包、对象就会创建)
//把类交给spring管理、相当于bean标签(<bean id="users" class="cn.kgc.demo.pojo.Users"></bean>)
//@Component、没有指定名称、默认首字母小写的类名、users
//@Component(value = "a1")、指定名称、a1
@Component(value = "a1")

//单例模式(singleton)、多例模式(prototype)
@Scope("singleton")

//懒加载
@Lazy(true)
public class Users implements java.io.Serializable {

    //@Value、设置成员变量上(通过反射给变量赋值)、加在set方法上(通过set方法赋值)
    @Value("10086")
    private Integer id; // 用户ID
    @Value("王冰冰")
    private String username; // 用户名
    private String password; // 密码
    @Value("1314520@qq.com")
    private String email; // 电子邮件

    public Users() {
        System.out.println("Users被初始化了...");
    }

    //构造方式注入：必须提供有参构造函数
    public Users(Integer id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    @Value("123456")
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
