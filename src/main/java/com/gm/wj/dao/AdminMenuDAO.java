package com.gm.wj.dao;

import com.gm.wj.entity.AdminMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *功能描述
        * @author JohnLuo
        * @date 2020/8/14
        * @param  * @param null
        * @return 
        */
public interface AdminMenuDAO extends JpaRepository<AdminMenu, Integer> {
     AdminMenu findById(int id);
     List<AdminMenu> findAllByParentId(int parentId);
}

