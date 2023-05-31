package org.charlie.mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.charlie.mybatisplus.entity.User;
import org.charlie.mybatisplus.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author Charlie-6327
 * @date 2023/5/9
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {
}
