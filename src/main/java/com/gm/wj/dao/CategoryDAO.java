package com.gm.wj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gm.wj.entity.Category;

/**
 *功能描述
        * @author JohnLuo
        * @date 2020/8/14
        * @param  * @param null
        * @return 
        */
public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
