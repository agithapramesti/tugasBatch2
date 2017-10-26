package com.example.Batch2.controller.employee;

import com.example.Batch2.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/tampilemp")
    public String MahasiswaList(Model model){
        model.addAttribute("employee", employeeService.showAllEmp());
        return "tampilemp";
    }
}
