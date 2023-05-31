package org.charlie.mybatisplus.entity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserTest {

    @Test
    public void testSelectAll() {
        User user = new User();
        List<User> users = user.selectAll();
        users.forEach(System.out::println);
    }

}