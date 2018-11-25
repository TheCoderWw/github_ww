package com.springmvc.dao;

import com.springmvc.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User findUserById(int id) throws Exception;

    void addUser(User user)throws Exception;
}
