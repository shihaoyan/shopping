package com.shy.shopping.entities.admin;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author 石皓岩
 * @create 2019-12-11 9:48
 * 描述：
 */
@SuppressWarnings("all")
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Admin implements Serializable {

    /**
     * 用户id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String adminname;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户信息
     */
    private AdminInfo adminInfo;
    /**
     * 创建时间
     */
    private String createDate;
    /**
     * 更新时间
     */
    private String updateDate;
    /**
     * 状态 1 标识未启用  0表示已经启用
     */
    private Integer state;


}
