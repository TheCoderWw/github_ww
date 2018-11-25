package com.springmvc.service;

import com.springmvc.dao.UserMapper;
import com.springmvc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        try {
            User u = userMapper.findUserById(id);
            return u;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}