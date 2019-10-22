package com.example.service;

import com.example.dao.UserInfoJpa;
import com.example.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Y.sh
 * @date 2019/10/22 10:24
 * @Description
 */
@Service
public class UserInfoService {
    @Autowired
    private UserInfoJpa userInfoJpa;

    public UserInfo findByName(String name){
        return userInfoJpa.findByName(name);
    }
}
