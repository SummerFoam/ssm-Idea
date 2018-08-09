package com.ssm.service;


import com.ssm.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public int add(User user);
    List<User> findAll(Map<String,Object> map);
}