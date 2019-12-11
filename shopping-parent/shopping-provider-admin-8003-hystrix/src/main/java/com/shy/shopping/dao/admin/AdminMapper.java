package com.shy.shopping.dao.admin;

import com.shy.shopping.entities.admin.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2019-12-11 11:16
 * 描述：
 */
@Mapper
public interface AdminMapper {
    /**
     * 查询所有管理员
     * @return
     */
    List<Admin> findAll();

    /**
     * 根据id查询管理员
     * @param id
     * @return
     */
    Admin findById(Integer id);

    /**
     * 添加管理员信息
     * @param admin
     * @return
     */
    boolean addAdmin(Admin admin);

    /**
     * 更新管理员信息
     * @param admin
     * @return
     */
    boolean updateAdmin(Admin admin);

    /**
     * 根据管理员id删除管理员信息
     * @param id
     * @return
     */
    boolean deleteAdmin(Integer id);
}
