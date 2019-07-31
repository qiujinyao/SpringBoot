package com.qianfeng.springboot.service;

import com.qianfeng.springboot.entity.TUser;

import java.util.List;

/**
 * @author qiujinyao
 * @version 1.0
 * @Date 2019/7/29
 */
public interface UserService {
    TUser getUserById(Long userId);

    int register(TUser user);

    int delete(Long id);

    List<TUser> getUserList();
}
