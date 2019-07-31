package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.entity.TUser;
import com.qianfeng.springboot.mapper.TUserMapper;
import com.qianfeng.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qiujinyao
 * @version 1.0
 * @Date 2019/7/29
 */
@Service
public class UserServceImpl implements UserService {
    @Autowired
    private  TUserMapper userMapper;

    @Override
    public TUser getUserById(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int register(TUser user) {
        return userMapper.register(user);
    }

    @Override
    public int delete(Long id) {
        return userMapper.delete(id);
    }

    @Override
    public List<TUser> getUserList() {
        return userMapper.getUserList();
    }
}
