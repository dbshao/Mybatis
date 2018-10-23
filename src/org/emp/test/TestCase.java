package org.emp.test;

import org.emp.controller.EmpController;
import org.emp.dao.EmpDao;
import org.emp.entity.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by itachi on 2017/2/10.
 */

public class TestCase {

    @Test
    public void test1() throws ClassNotFoundException {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpController ctl=ac.getBean(EmpController.class);
        ctl.addBatch();
    }

}
