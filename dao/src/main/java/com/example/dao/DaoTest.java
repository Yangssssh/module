package com.example.dao;

import com.example.entity.EntityTest;

/**
 * @author Y.sh
 * @date 2019/10/21 18:05
 * @Description
 */
public class DaoTest {
    public String showDao(){
        EntityTest entityTest=new EntityTest();
        return entityTest.showEntity()+"我是dao! ";
    }
}
