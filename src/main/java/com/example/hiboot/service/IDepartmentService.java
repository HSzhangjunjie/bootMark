package com.example.hiboot.service;

import com.example.hiboot.entity.Department;

/**
 * @ProjectName: hiboot
 * @Package: com.example.hiboot.service
 * @ClassName: IDepartmentService
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/7/15 20:29
 * @Version: 1.0
 */
public interface IDepartmentService {
    Department findById(Integer id);
    Department update(Department department);
    void delete(Integer id);
    void receive(Department department);
}
