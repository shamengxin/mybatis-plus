package com.shamengxin.mybatisx.mapper;
import org.apache.ibatis.annotations.Param;

import com.shamengxin.mybatisx.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author he'yu'feng
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2023-03-29 13:20:49
* @Entity com.shamengxin.mybatisx.pojo.User
*/
public interface UserMapper extends BaseMapper<User> {

    int insertSelective(User user);

    int deleteByUidAndUserName(@Param("uid") Long uid, @Param("userName") String userName);

    int updateAgeAndEmailByUid(@Param("age") Integer age, @Param("email") String email, @Param("uid") Long uid);

    List<User> selectAgeAndEmailByAgeBetween(@Param("beginAge") Integer beginAge, @Param("endAge") Integer endAge);

    List<User> selectAllOrderByAgeDesc();
}




