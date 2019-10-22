package com.example.web;

import com.example.service.ServiceTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Y.sh
 * @date 2019/10/21 18:10
 * @Description
 */
@RestController
@RequestMapping(value = "/test")
public class WebTest {
    @RequestMapping(value = "/showAll")
    public String showAll(){
        ServiceTest serviceTest=new ServiceTest();
        return serviceTest.showService()+"我是web!!!";
    }
}
