package com.example.service;

import com.example.dao.DaoTest;

/**
 * @author Y.sh
 * @date 2019/10/21 18:07
 * @Description
 */
public class ServiceTest {
    public String showService(){
        DaoTest daoTest=new DaoTest();
        return daoTest.showDao()+"我是service! ";
    }
}
