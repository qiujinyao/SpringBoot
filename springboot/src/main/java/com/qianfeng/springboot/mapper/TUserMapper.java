package com.qianfeng.springboot.mapper;
import com.qianfeng.springboot.entity.TUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TUserMapper {
    TUser selectByPrimaryKey(Long userId);

    int register(TUser user);

    int delete(Long id);

    List<TUser> getUserList();
}