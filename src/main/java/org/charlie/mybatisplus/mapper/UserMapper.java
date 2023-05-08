package org.charlie.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.charlie.mybatisplus.entity.User;

/**
 * @author Charlie-6327
 * @date 2023/5/8
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
