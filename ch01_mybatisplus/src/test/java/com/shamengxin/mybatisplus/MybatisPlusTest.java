package com.shamengxin.mybatisplus;

import com.shamengxin.mybatisplus.mapper.UserMapper;
import com.shamengxin.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
public class MybatisPlusTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList(){
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        //INSERT INTO user ( id, name, age, email ) VALUES ( ?, ?, ?, ? )
        User user = new User();
        user.setName("张三");
        user.setAge(20);
        user.setEmail("zhangsan@shamengxin.com");
        int result = userMapper.insert(user);
        System.out.println("result:"+result);
        System.out.println("id:"+user.getId());
    }

    @Test
    public void testDelete(){
        //DELETE FROM user WHERE id=?
        /*int result = userMapper.deleteById(1640698904461406210L);
        System.out.println("result:"+result);*/

        //DELETE FROM user WHERE name = ? AND age = ?
        /*Map<String, Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("age",20);
        int result = userMapper.deleteByMap(map);
        System.out.println("result:"+result);*/

        // DELETE FROM user WHERE id IN ( ? , ? , ? )
        List<Long> list = Arrays.asList(1L, 2L, 3L);
        int result = userMapper.deleteBatchIds(list);
        System.out.println("result:"+result);
    }

    @Test
    public void testUpdate(){
        //UPDATE user SET name=?, email=? WHERE id=?
        User user = new User();
        user.setId(4L);
        user.setName("李四");
        user.setEmail("lisi@shamengxin.com");
        int result = userMapper.updateById(user);
        System.out.println("result:"+result);
    }

    @Test
    public void testSelect(){
        //SELECT id,name,age,email FROM user WHERE id=?
        /*User user = userMapper.selectById(1L);
        System.out.println(user);*/

        //SELECT id,name,age,email FROM user WHERE id IN ( ? , ? , ? )
        /*List<Long> list = Arrays.asList(1L, 2L, 3L);
        List<User> userList = userMapper.selectBatchIds(list);
        userList.forEach(System.out::println);*/

        //SELECT id,name,age,email FROM user WHERE name = ? AND age = ?
        /*Map<String,Object> map = new HashMap<>();
        map.put("name","Jack");
        map.put("age",20);
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);*/

        //SELECT id,name,age,email FROM user
        /*List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);*/

        //select id,name,age,email from user where id=?
        Map<String, Object> map = userMapper.selectMapById(1L);
        System.out.println(map);

    }
}
