package org.charlie.mybatisplus.service;

import org.charlie.mybatisplus.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class Dynamic2UserServiceTest {

    @Resource
    private Dynamic2UserService service2;

    @Resource
    private Dynamic1UserService service1;

    /**
     * 测试多个DS执行同一个数据库操作
     * 结果是各自访问各自的源
     */
    @Test
    public void save() {
        User user2 = new User();
        user2.setNikeName("Dynamic2");
        user2.setAge(2);
        user2.setEmail("dynamic2@222");
        service2.save(user2);

        User user1 = new User();
        user1.setNikeName("Dynamic1");
        user1.setAge(1);
        user1.setEmail("dynamic1@111");
        service1.save(user1);
    }
}