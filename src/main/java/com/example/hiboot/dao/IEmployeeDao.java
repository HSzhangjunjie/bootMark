package com.example.hiboot.dao;

import com.example.hiboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * (Employee)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-13 23:32:54
 */

public interface IEmployeeDao extends JpaRepository<Employee, Integer> {

}