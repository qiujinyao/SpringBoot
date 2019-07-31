package com.qianfeng.springboot.controller;
import com.qianfeng.springboot.entity.TUser;
import com.qianfeng.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

/**
 * @author qiujinyao
 * @version 1.0
 * @Date 2019/7/29
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
     //查询单个
    @RequestMapping("getUser/{userId}")
    public TUser getUser(@PathVariable Long userId){
        return userService.getUserById(userId);
    }
    //增加对象
    @RequestMapping("register")
    public  TUser register(@Valid TUser user){
        int result=userService.register(user);
        if(result>0){
            return user;
        }else{
            return null;
        }
    }
    //删除数据
    @RequestMapping("delete/{id}")
    public  String delete(@PathVariable Long id){
        int i=7/0;
        int result=userService.delete(id);
        if (result>0){
            return "删除成功！";
        }else {
            return "删除失败!";
        }
    }
}
