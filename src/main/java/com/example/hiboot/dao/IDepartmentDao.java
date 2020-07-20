package com.example.hiboot.dao;

import com.example.hiboot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * (Department)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-13 23:32:42
 */

public interface IDepartmentDao extends JpaRepository<Department,Integer> {
}