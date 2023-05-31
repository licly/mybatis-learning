package org.charlie.mybatisplus.service;

import org.charlie.mybatisplus.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService service;

    @Test
    public void testList() {
        List<User> users = service.list();
        users.forEach(System.out::println);
    }

}