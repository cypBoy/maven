package com.ssm.service.Impl;

import com.ssm.model.ClassInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)// 添加spring测试方案
@ContextConfiguration("/spring-mybatis.xml")// 指定spring配置文件位置
public class ClassInfoServiceTest {

    @Autowired
    private ClassInfoService classInfoService;

    @Test
    public void getAllClassInfos() {
    }

    @Test
    public void addClass() {
    }

    @Test
    public void deleteClass() {
    }

    @Test
    public void getedit() throws Exception {
        ClassInfo classInfo=classInfoService.getedit(4);
        System.out.println(classInfo);

    }

    @Test
    public void editClass() {
    }

    @Test
    public void selectByName() {
    }
}