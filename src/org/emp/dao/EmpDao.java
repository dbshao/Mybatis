package org.emp.dao;

import org.emp.entity.Condition;
import org.emp.entity.Emp;
import org.emp.util.MyBatisDao;

import java.util.List;

/**
 * Created by itachi on 2017/2/10.
 */
@MyBatisDao
public interface EmpDao {
   List<Emp> findAll();
    Emp findById(int i);
    void save(Emp emp);
    void delete(int i);
    void update(Emp emp);

    //查询部门下的所有员工
    List<Emp> findByDept(Condition cond);
//    根据工资查询员工
    List<Emp> findBySalary(Condition cond);

    //根据部门和工资查询员工
   List<Emp> findByDeptAndSalary(Condition cond);

 //根据部门和工资查询员工
 List<Emp> findByDeptAndSalary2(Condition cond);
 void update2(Emp emp);

// 根据一组id查询员工

 List<Emp> findByIds(Condition cond);
}
