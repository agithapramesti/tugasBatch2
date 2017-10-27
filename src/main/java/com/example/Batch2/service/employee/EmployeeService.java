package com.example.Batch2.service.employee;

import com.example.Batch2.model.employee.Employee;
import com.example.Batch2.repository.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> showAllEmp() {
        List<Employee> temp = employeeRepository.findAll();
        return temp;
    }

    public Employee saveOrUpdate(Employee e) {
        Employee temp1 = employeeRepository.save(e);
        return temp1;
    }

    public Employee getIdEmp(Integer id) {
        Employee get = employeeRepository.findOne(id);
        return get;
    }

    public void hapus(Integer id) {
        employeeRepository.delete(id);
    }
}
