package org.emp.controller;

import org.emp.entity.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by itachi on 2017/2/13.
 */
@Controller
@RequestMapping("/test")
public class JasonController {

    @RequestMapping("/test1.do")
    @ResponseBody
    public boolean test1(){
        return true;
    }

    @RequestMapping("/test2.do")
    @ResponseBody
    public Map<String,Object> test2(){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("1",33);
        map.put("2",34);
        map.put("3",55);
        return map;
    }


    @ResponseBody
    @RequestMapping("/test5.do")
    public List<Emp> test5(){
        List<Emp> list =new ArrayList<Emp>();
        Emp e1=new Emp();
        e1.setEmpno(333);
        e1.setJob("hhh");
        e1.setMgr(444);

        Emp e2=new Emp();
        e2.setEmpno(333);
        e2.setJob("hhh");
        e2.setMgr(444);

        Emp e3=new Emp();
        e3.setEmpno(333);
        e3.setJob("hhh");
        e3.setMgr(444);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        return list;
    }
}
