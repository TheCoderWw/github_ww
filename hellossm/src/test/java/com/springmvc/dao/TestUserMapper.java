package com.springmvc.dao;

import com.springmvc.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext.xml"}) //*可加可不加
@Component
public class TestUserMapper {
    ApplicationContext applicationContext;
    @Autowired
    private User user1;

    @Before
    public void before(){
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }
    @Test
    public void test() throws Exception {
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.findUserById(2);
        System.out.println(user);
    }

    @Test
    public void testAdd() throws Exception {
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        user1.setName("lala");
        user1.setAge(44);
        user1.setPassword("lele");
        userMapper.addUser(user1);
    }
}
