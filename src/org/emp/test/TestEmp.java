package org.emp.test;

import org.emp.dao.EmpDao;
import org.emp.entity.Condition;
import org.emp.entity.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by itachi on 2017/2/13.
 */
public class TestEmp {

    @Test
    public void TestByDeptno(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao dao=ac.getBean("empDao",EmpDao.class);

    }

    @Test
    public void TestBySalary(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao dao=ac.getBean("empDao",EmpDao.class);
        Condition cond=new Condition();
        cond.setSalary(3500.0);
        List<Emp> list=dao.findBySalary(cond);
        System.out.println(list);
    }

    @Test
    public void TestBydeptAndSal(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao dao=ac.getBean("empDao",EmpDao.class);
        Condition cond=new Condition();
        cond.setDeptno(20);
        cond.setSalary(2000.0);
        List<Emp> list=dao.findByDeptAndSalary2(cond);
        System.out.println(list);
    }

    @Test
    public void update(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao dao=ac.getBean("empDao",EmpDao.class);
        Emp emp = new Emp();
        emp.setEmpno(7878);
        emp.setJob("SALESMAN");
        dao.update(emp);
    }

    @Test
    public void findByIds(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao dao=ac.getBean("empDao",EmpDao.class);
        List<Integer> list =new ArrayList<Integer>();
        list.add(7876);
        list.add(7566);
        list.add(7698);
        Condition cond=new Condition();
        cond.setEmpnos(list);
        System.out.println(dao.findByIds(cond));
    }


}
