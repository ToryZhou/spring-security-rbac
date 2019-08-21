package com.example.springsecurityrbac.dao;

import com.example.springsecurityrbac.model.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : toryzhou
 * @date : 3/25/19 15:31
 */
@RunWith(SpringRunner.class)
@MybatisTest
//@SpringBootTest(classes = {UserMapper.class})
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
        System.out.println("tested");
    }
}
