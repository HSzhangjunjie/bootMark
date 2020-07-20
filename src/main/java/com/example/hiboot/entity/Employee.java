package com.example.hiboot.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * (Employee)实体类
 *
 * @author makejava
 * @since 2020-07-13 23:32:54
 */
@Entity
@Table
public class Employee implements Serializable {
    private static final long serialVersionUID = -32413062644538894L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Integer empId;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private Integer gender;

    @ManyToOne(targetEntity = Department.class)
    @JoinColumn(name = "d_id",referencedColumnName = "dept_id")
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getId() {
        return empId;
    }

    public void setId(Integer id) {
        this.empId = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return empId.equals(employee.empId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + empId +
                ", lastname='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}