package com.shamengxin.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.springframework.transaction.event.TransactionalEventListener;

@Data
// @TableName("t_user")
public class User {

    // @TableId(value = "uid",type = IdType.AUTO)
    @TableId("uid")
    private Long id;

    @TableField("user_name")
    private String name;

    private Integer age;

    private String email;

    @TableLogic
    private Integer isDeleted;

}
