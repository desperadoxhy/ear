package com.ear.mybatisreverse.mapper;

import com.ear.mybatisreverse.model.WeChatUser;

public interface WeChatUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WeChatUser record);

    int insertSelective(WeChatUser record);

    WeChatUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WeChatUser record);

    int updateByPrimaryKey(WeChatUser record);
}