package com.example.Batch2.controller.employee;

import com.example.Batch2.model.employee.category.Category;
import com.example.Batch2.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableAutoConfiguration
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @RequestMapping("/category")
    public String CategoryList(Model model){
        model.addAttribute("category", categoryService.showAllCategory());
        return "category";
    }
    @RequestMapping(value = "/category/createCategory", method = RequestMethod.GET)
    public String tampilFormCreateCategory(Model model){
        model.addAttribute("category", new Category());
        return "createCategory";
    }
    @RequestMapping(value="/category/createCategory",method = RequestMethod.POST)
    public String simpanDataCategory(Model model, Category c){
        model.addAttribute("category",categoryService.saveOrUpdateCategory(c));
        return "redirect:/category";
    }
    @RequestMapping(value = "/category/edit/{id}",method = RequestMethod.GET)
    public String editDataCategory(@PathVariable Integer id,Model model){
        model.addAttribute("category",categoryService.getIdCategory(id));
        return "createCategory";
    }
    @RequestMapping(value = "/category/hapus/{id}",method = RequestMethod.GET)
    public String hapusDataCategory(@PathVariable Integer id,Model model){
        categoryService.hapusCategory(id);
        return "redirect:/category";
    }

}
