package com.gm.wj.dao;

import com.gm.wj.entity.AdminPermission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *功能描述
        * @author JohnLuo
        * @date 2020/8/14
        * @param  * @param null
        * @return
        */
public interface AdminPermissionDAO extends JpaRepository<AdminPermission, Integer> {
    AdminPermission findById(int id);
}
