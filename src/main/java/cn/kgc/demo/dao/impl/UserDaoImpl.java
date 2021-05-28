package cn.kgc.demo.dao.impl;

import cn.kgc.demo.dao.UserDao;
import cn.kgc.demo.pojo.Users;
import org.springframework.stereotype.Repository;

//@Repository、一般用于、持久层
//把dao的类交由spring管理、mybatis、实现类不需要、接口开发(.xml)
@Repository("a3")
public class UserDaoImpl implements UserDao {
    @Override
    public int insertUsers(Users users) {
        System.out.println("users = " + users);
        System.out.println("UserDaoImpl ... 保存成功");
        return 1;
    }

}
