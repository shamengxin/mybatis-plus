package com.shamengxin.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.shamengxin.mybatisplus.enums.SexEnum;
import lombok.Data;
import org.springframework.transaction.event.TransactionalEventListener;
import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

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

    private SexEnum sex;

    @TableLogic
    private Integer isDeleted;

}
