package com.gm.wj.dto;

import com.gm.wj.dto.base.OutputConverter;
import com.gm.wj.entity.AdminRole;
import com.gm.wj.entity.User;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 *功能描述
        * @author JohnLuo
        * @date 2020/8/14
        * @param  * @param null
        * @return 
        */
@Data
@ToString
public class UserDTO implements OutputConverter<UserDTO, User> {

    private int id;

    private String username;

    private String name;

    private String phone;

    private String email;

    private boolean enabled;

    private List<AdminRole> roles;

}
