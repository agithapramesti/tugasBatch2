package com.example.Batch2.controller.employee;

import com.example.Batch2.model.employee.Employee;
import com.example.Batch2.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    @RequestMapping(value = "/tampilemp/create", method = RequestMethod.GET)
    public String tampilFormCreate(Model model){
        model.addAttribute("employee", new Employee());
        return "create";
    }
    @RequestMapping(value = "/tampilemp/create", method = RequestMethod.POST)
    public String simpanDataEmployee(Model model,Employee employee){
        model.addAttribute("employee",employeeService.saveOrUpdate(employee));
        return "redirect:/tampilemp";
    }
    @RequestMapping(value = "/tampilemp/edit/{id}", method = RequestMethod.GET)
    public String editData(@PathVariable Integer id,Model model){
        model.addAttribute("employee",employeeService.getIdEmp(id));
        return "create";
    }
    @RequestMapping(value = "/tampilemp/hapus/{id}", method = RequestMethod.GET)
    public String hapusData(@PathVariable Integer id,Model model){
        employeeService.hapus(id);
        return "redirect:/tampilemp";
    }
}
