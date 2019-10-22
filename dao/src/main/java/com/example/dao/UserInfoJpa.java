package com.example.dao;

import com.example.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Y.sh
 * @date 2019/10/22 10:22
 * @Description
 */
public interface UserInfoJpa extends JpaRepository<UserInfo,Long> {

    UserInfo findByName(String name);
}
