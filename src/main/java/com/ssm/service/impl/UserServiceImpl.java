package com.ssm.service.impl;

import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    public int add(User user) {
        int i = userMapper.add(user);
        return i;
    }

    public List<User> findAll(Map<String, Object> map) {
        return userMapper.findAll(map);
    }
}
