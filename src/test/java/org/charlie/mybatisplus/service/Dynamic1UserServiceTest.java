package org.charlie.mybatisplus.service;

import org.charlie.mybatisplus.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Dynamic1UserServiceTest {

    @Resource
    private Dynamic1UserService service;

    @Test
    public void save() {
        User user = new User();
        user.setNikeName("Dynamic1");
        user.setAge(1);
        user.setEmail("dynamic1@111");
        service.save(user);
    }
}