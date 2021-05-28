package cn.kgc.demo.dao.impl;

import cn.kgc.demo.dao.UserDao;
import cn.kgc.demo.pojo.Users;
import org.springframework.stereotype.Repository;

@Repository("a4")
public class UserDemoDaoImpl implements UserDao {
    @Override
    public int insertUsers(Users users) {
        System.out.println("users = " + users);
        System.out.println("UserDemoDaoImpl ... 保存成功");
        return 1;
    }

}
