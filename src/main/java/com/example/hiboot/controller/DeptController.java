package com.example.hiboot.controller;

import com.example.hiboot.entity.Department;
import com.example.hiboot.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: hiboot
 * @Package: com.example.hiboot.controller
 * @ClassName: DeptController
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/7/13 23:55
 * @Version: 1.0
 */
@RestController
public class DeptController {
    @Autowired
    private IDepartmentService departmentService;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departmentService.findById(id);
    }

    @GetMapping("/dept/hello")
    public Department update() {
        Department department=new Department();
        department.setId(1);
        department.setDepartmentName("开发部");
        departmentService.update(department);
        return department;
    }
}
