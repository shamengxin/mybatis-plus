package com.shamengxin.mybatisplus;

import com.shamengxin.mybatisplus.pojo.User;
import com.shamengxin.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class MybatisPlusServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetCount(){
        //SELECT COUNT( * ) FROM user
        long count = userService.count();
        System.out.println("总记录条数："+count);
    }

    @Test
    public void testInsertMore(){
        //INSERT INTO user ( id, name, age ) VALUES ( ?, ?, ? )
        List<User> list = new ArrayList<>();
        for (int i = 1; i <=10 ; i++) {
            User user = new User();
            user.setName("shamengxin"+i);
            user.setAge(10+ i);
            list.add(user);
        }
        boolean b = userService.saveBatch(list);
        System.out.println(b);
    }

}
