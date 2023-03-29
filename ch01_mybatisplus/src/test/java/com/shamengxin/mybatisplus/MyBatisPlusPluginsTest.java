package com.shamengxin.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shamengxin.mybatisplus.mapper.ProductMapper;
import com.shamengxin.mybatisplus.mapper.UserMapper;
import com.shamengxin.mybatisplus.pojo.Product;
import com.shamengxin.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPlusPluginsTest {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testPage(){

        Page<User> page = new Page<>(1,3);

        userMapper.selectPage(page, null);

        System.out.println(page.getRecords());
        System.out.println(page.getCurrent());
        System.out.println(page.getTotal());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
        System.out.println(page.getPages());

    }

    @Test
    public void  testPageVo(){
        //select uid,user_name,age,email from t_user where age>? LIMIT ?
        Page<User> page = new Page<>(1,3);
        userMapper.selectPageVo(page,20);
        System.out.println(page.getRecords());
        System.out.println(page.getCurrent());
        System.out.println(page.getTotal());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
        System.out.println(page.getPages());

    }

    @Test
    public void testProduct01(){

        //小李查询商品价格
        Product productLi = productMapper.selectById(1);
        System.out.println("小李查询的商品价格："+productLi);

        //小王查询商品价格
        Product productWang = productMapper.selectById(1);
        System.out.println("小王查询的商品价格："+productWang);

        productLi.setPrice(productLi.getPrice()+50);
        productMapper.updateById(productLi);

        productWang.setPrice(productWang.getPrice()-30);
        int result = productMapper.updateById(productWang);
        if (result==0){
            Product product = productMapper.selectById(1);
            product.setPrice(product.getPrice()-30);
            productMapper.updateById(product);
        }

        Product productBoos = productMapper.selectById(1);
        System.out.println("老板查询的商品价格："+productBoos.getPrice());



    }

}
