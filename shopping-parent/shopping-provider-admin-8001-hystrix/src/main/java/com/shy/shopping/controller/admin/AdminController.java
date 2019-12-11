package com.shy.shopping.controller.admin;

import com.shy.shopping.entities.admin.Admin;
import com.shy.shopping.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2019-12-11 11:23
 * 描述：
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;


    /**
     * 添加管理员服务
     * @param admin
     * @return
     */
    @PostMapping("/admin/add")
    public boolean add(@RequestBody Admin admin){
        return adminService.add(admin);
    }

    /**
     * 根据id查询管理员信息
     * @param id
     * @return
     */
    @GetMapping("/admin/get/{id}")
    public Admin get(@PathVariable("id") Integer id){
        return adminService.get(id);
    }

    /**
     * 更新管理员信息
     * @param admin
     * @return
     */
    @PostMapping("/admin/update")
    public boolean update(@RequestBody Admin admin){
        return adminService.update(admin);
    }

    /**
     * 获取所有的管理员信息
     * @return
     */
    @GetMapping("/admin/list")
    public List<Admin> list(){
        return adminService.list();
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @GetMapping("/admin/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return adminService.delete(id);
    }








}
