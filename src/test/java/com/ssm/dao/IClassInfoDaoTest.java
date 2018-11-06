package com.ssm.dao;

import com.ssm.model.ClassInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IClassInfoDaoTest {

    private ApplicationContext applicationContext;
    @Autowired
    private IClassInfoDao iClassInfoDao;

    @Before
    public void Before() {
        applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring-mybatis.xml"});//加载spring配置文件
        iClassInfoDao = applicationContext.getBean(IClassInfoDao.class);//在这里导入要测试的
    }

    @Test
    public void insertClassInfo() {
    }

    @Test
    public void updateClassInfo() {
    }

    @Test
    public void deleteClassInfo() {
    }

    @Test
    public void selectClassInfoById() throws Exception {

        ClassInfo classInfo=iClassInfoDao.selectClassInfoById(1);
        System.out.println(classInfo);
    }

    @Test
    public void selectAllClassInfo() {
    }

    @Test
    public void selectClassInfoByName() {
    }
}