package com.shy.shopping.service.admin.impl;

import com.shy.shopping.dao.admin.AdminMapper;
import com.shy.shopping.entities.admin.Admin;
import com.shy.shopping.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2019-12-11 11:14
 * 描述：
 */
@SuppressWarnings("all")
@Service
public class AdminServiceImpl implements AdminService {

    /**
     * 管理员的mapper
     */
    @Autowired
    private AdminMapper adminMapper;

    /**
     * 查询所有管理员信息
     * @return
     */
    @Override
    public List<Admin> list() {
        return adminMapper.findAll();
    }

    /**
     * 根据id查询管理员信息
     * @param id
     * @return
     */
    @Override
    public Admin get(Integer id) {
        return adminMapper.findById(id);
    }

    /**
     * 添加管理员信息
     * @param admin
     * @return
     */
    @Override
    public boolean add(Admin admin) {
        return adminMapper.addAdmin(admin);
    }

    /**
     * 更新管理员信息
     * @param admin
     * @return
     */
    @Override
    public boolean update(Admin admin) {
        return adminMapper.updateAdmin(admin);
    }

    /**
     * 根据id删除管理员信息
     * @param id
     * @return
     */
    @Override
    public boolean delete(Integer id) {
        return adminMapper.deleteAdmin(id);
    }
}
