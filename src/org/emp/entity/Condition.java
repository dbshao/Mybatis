package org.emp.entity;

import java.util.List;

/**
 * Created by itachi on 2017/2/13.
 */

//创建封装查询条件类
public class Condition {
    private Integer deptno;
    private Double salary;
    private List<Integer> empnos;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Integer> getEmpnos() {
        return empnos;
    }

    public void setEmpnos(List<Integer> empno) {
        this.empnos = empno;
    }
}
