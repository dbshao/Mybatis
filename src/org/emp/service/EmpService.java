package org.emp.service;

import org.emp.dao.EmpDao;
import org.emp.entity.Emp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by itachi on 2017/2/10.
 */
@Service
public class EmpService {
    @Resource
    private EmpDao empDaodao;

    public EmpDao getEmpDaodao() {
        return empDaodao;
    }

    public void setEmpDaodao(EmpDao empDaodao) {
        this.empDaodao = empDaodao;
    }

    public List<Emp> findAll(){
        return empDaodao.findAll();
    }
}
