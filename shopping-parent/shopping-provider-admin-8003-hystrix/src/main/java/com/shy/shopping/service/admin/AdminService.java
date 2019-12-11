package com.shy.shopping.service.admin;

import com.shy.shopping.entities.admin.Admin;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2019-12-11 11:08
 * 描述：
 */
public interface AdminService {

    /**
     * 查询管理员用户信息
     * @return
     */
    List<Admin> list();

    /**
     * 根据id查询管理员信息
     * @param id
     * @return
     */
    Admin get(Integer id);

    /**
     * 添加管理员
     * @param admin
     * @return
     */
    boolean add(Admin admin);

    /**
     * 更新管理员信息
     * @param admin
     * @return
     */
    boolean update(Admin admin);

    /**
     * 根据管理员id删除管理员
     * @param id
     * @return
     */
    boolean delete(Integer id);




}
