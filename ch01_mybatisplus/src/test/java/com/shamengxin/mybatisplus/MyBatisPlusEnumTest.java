package com.shamengxin.mybatisplus;

import com.shamengxin.mybatisplus.enums.SexEnum;
import com.shamengxin.mybatisplus.mapper.UserMapper;
import com.shamengxin.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPlusEnumTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        User user = new User();
        user.setName("admin");
        user.setAge(33);
        user.setSex(SexEnum.MALE);
        int insert = userMapper.insert(user);
        System.out.println("result:"+insert);
    }

}
