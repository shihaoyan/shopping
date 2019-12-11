package com.shy.shopping.entities.admin;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author 石皓岩
 * @create 2019-12-11 10:11
 * 描述：
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class AdminInfo implements Serializable {
    /**
     * 用户id
     */
    private Integer uid;
    /**
     * 真实姓名
     */
    private String trueName;
    /**
     * 性别
     */
    private String gender;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 电话
     */
    private String phone;
    /**
     * 邮箱
     */
    private String birthday;
    /**
     * 状态 0表示未启用  1表示启用
     */
    private Integer state;
}
