package com.example.Batch2.repository.employee;

import com.example.Batch2.model.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class EmployeeRepolmpl implements RepoEmployeeCustom {
    @Autowired
    EntityManager entityManager;
    @Override
    public List<Employee> getAllEmployee(){
        List<Employee> data= this.entityManager.createNativeQuery(
                "select * from Employee", Employee.class).getResultList();
        return data;
    }
}
