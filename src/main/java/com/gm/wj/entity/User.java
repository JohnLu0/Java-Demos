package com.gm.wj.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 *功能描述
 * @author JohnLuo
 * @date 2020/8/14
 * @param  * @param null
 * @return
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user")
@ToString
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    /**
     * Username.
     */
    @NotEmpty(message = "用户名不能为空")
    private String username;

    /**
     * Password.
     */
    private String password;

    /**
     * Salt for encoding.
     */
    private String salt;

    /**
     * Real name.
     */
    private String name;

    /**
     * Phone number.
     */
    private String phone;

    /**
     * Email address.
     *
     * A Email address can be null,but should be correct if exists.
     */
    @Email(message = "请输入正确的邮箱")
    private String email;

    /**
     * User status.
     */
    private boolean enabled;

    /**
     * Transient property for storing role owned by current user.
     */
    @Transient
    private List<AdminRole> roles;

    public static User.UserBuilder builder() {
        return User.UserBuilder.anUser();
    }


    public static final class UserBuilder {
        private int id;
        private String username;
        private String password;
        private String salt;
        private String name;
        private String phone;
        private String email;
        private boolean enabled;
        private List<AdminRole> roles;

        private UserBuilder() {
        }

        public static UserBuilder anUser() {
            return new UserBuilder();
        }

        public UserBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public UserBuilder withUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder withSalt(String salt) {
            this.salt = salt;
            return this;
        }

        public UserBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder withEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public UserBuilder withRoles(List<AdminRole> roles) {
            this.roles = roles;
            return this;
        }

        public User build() {
            User user = new User();
            user.id = this.id;
            user.salt = this.salt;
            user.username = this.username;
            user.password = this.password;
            user.roles = this.roles;
            user.enabled = this.enabled;
            user.email = this.email;
            user.name = this.name;
            user.phone = this.phone;
            return user;
        }
    }
}

