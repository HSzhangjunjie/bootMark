package com.example.hiboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * (Department)实体类
 *
 * @author makejava
 * @since 2020-07-13 23:32:41
 */
@Entity
@Table(name = "department")
public class Department implements Serializable {
    private static final long serialVersionUID = 961966655181367358L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dept_id")
    private Integer deptId;
    @Column
    private String departmentName;
    @JsonIgnore
    @OneToMany(targetEntity = Employee.class, fetch = FetchType.EAGER)
    private Set<Employee> employees = new HashSet<>();

    public Department() {
    }

    public Department(Integer deptId, String departmentName) {
        this.deptId = deptId;
        this.departmentName = departmentName;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Integer getId() {
        return deptId;
    }

    public void setId(Integer id) {
        this.deptId = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentname) {
        this.departmentName = departmentname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + deptId +
                ", departmentname='" + departmentName + '\'' +
                '}';
    }
}