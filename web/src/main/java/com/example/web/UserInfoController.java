package com.example.web;

import com.example.entity.UserInfo;
import com.example.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Y.sh
 * @date 2019/10/22 10:30
 * @Description   spring-boot多模块项目对于jpa整合
 */
@RestController
@RequestMapping(value = "/user")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(method = RequestMethod.GET,value = "/find")
    public UserInfo findByName(String name){
        return userInfoService.findByName(name);
    }
}
