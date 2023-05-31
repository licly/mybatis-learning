package org.charlie.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * @author Charlie-6327
 * @date 2023/5/8
 */
@Data
@TableName("t_user")
public class User extends Model<User> {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    @TableField("name")
    private String nikeName;
    private Integer age;
    private String email;
}
