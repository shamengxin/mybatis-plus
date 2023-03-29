package com.shamengxin.mybatisx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shamengxin.mybatisx.pojo.User;
import com.shamengxin.mybatisx.service.UserService;
import com.shamengxin.mybatisx.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author he'yu'feng
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2023-03-29 13:20:49
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




