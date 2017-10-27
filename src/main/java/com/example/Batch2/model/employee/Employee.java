package com.example.Batch2.model.employee;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    private String employee_name;
    private String employee_uname;
    private String password;
    private String role;
    private int status;

    public Employee() {
        System.out.println("no id:"+id);
    }

    public Employee(Integer id,String employee_name, String employee_uname, String password, String role, int status)
    {
        this.id=id;
        this.employee_name = employee_name;
        this.employee_uname = employee_uname;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public String getEmployee_uname() {
        return employee_uname;
    }

    public void setEmployee_uname(String employee_uname) {
        this.employee_uname = employee_uname;
    }

    public Integer getEmployee_id() {
        return id;
    }

    public void setEmployee_id(Integer id) {
        this.id = id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
