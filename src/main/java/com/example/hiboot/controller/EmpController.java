package com.example.hiboot.controller;

import com.example.hiboot.dao.IEmployeeDao;
import com.example.hiboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: hiboot
 * @Package: com.example.hiboot.controller
 * @ClassName: EmpController
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/7/14 0:01
 * @Version: 1.0
 */
@RestController
public class EmpController {
    @Autowired
    private IEmployeeDao employeeDao;

    @RequestMapping("/e_mp/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id){
        return employeeDao.findById(id).get();
    }
}
