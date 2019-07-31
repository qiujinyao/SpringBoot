package com.qianfeng.springboot.controller;

import com.qianfeng.springboot.entity.TUser;
import com.qianfeng.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author qiujinyao
 * @version 1.0
 * @Date 2019/7/30
 */
@Controller
@RequestMapping("view")
public class ViewController {
    @Autowired
    private UserService userService;

    @RequestMapping("showall")
    public String  showall(Model model){
        List<TUser> tUserList=userService.getUserList();
        model.addAttribute("tUserList",tUserList);
        return "Tuer_list";
    }
}
