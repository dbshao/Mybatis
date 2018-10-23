package org.emp.controller;

import org.emp.dao.EmpDao;
import org.emp.entity.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by itachi on 2017/2/10.
 */

@Controller
@RequestMapping("/emp")
@Transactional(rollbackFor = java.lang.ClassCastException.class)
public class EmpController {
    @Resource
    private EmpDao empDao;

    public EmpDao getEmpDao() {
        return empDao;
    }

    public void setEmpDao(EmpDao empDao) {
        this.empDao = empDao;
    }
    //模拟批量插入数据
    @RequestMapping("/addEmp.do")
    public String addBatch() throws ClassNotFoundException {
        //插入第一个员工
        Emp e1=new Emp();
        e1.setEname("姚明");
        e1.setJob("中锋");
        e1.setSal(10000.0);
        empDao.save(e1);
        //Integer.parseInt("abc");

        Class.forName("BadClass");
//        spring 对于非检查时异常，不会回滚，需要指明或者配置(rollback-for)

        //插入第二个
        Emp e2=new Emp();
        e2.setEname("乔丹");
        e2.setJob("后卫");
        e2.setSal(10800.0);
        empDao.save(e2);

        return "emp/emp_list";
    }
}
