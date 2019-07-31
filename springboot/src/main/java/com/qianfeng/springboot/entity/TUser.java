package com.qianfeng.springboot.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Value;
import javax.validation.constraints.*;
import java.util.Date;
@Data

public class TUser {
    private Integer id;
    @NotNull
    @Value("${resource.name}")
    private String username;
    @NotBlank ( message = "密码的长度必须大于0" )
    @Value("${resource.password}")
    private String password;
    private Date registerdate;
    @Pattern ( regexp = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$", message = "邮箱格式不正确" )
    private String email;
    @Pattern ( regexp = "^1(3|4|5|7|8)\\d{9}$", message = "手机号格式不正确" )
    private String phone;
    @Range(min = 18,max = 150,message = "年龄必须在18-150之间")
    private Integer age;

}