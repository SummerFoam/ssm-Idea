package com.ssm.dao;

import com.ssm.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public int add(User user);

    List<User> findAll(Map<String, Object> map);
}
