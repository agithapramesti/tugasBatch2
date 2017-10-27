package com.example.Batch2.service.category;

import com.example.Batch2.model.employee.category.Category;
import com.example.Batch2.repository.category.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }

    public List<Category> showAllCategory(){
        List<Category> temp=categoryRepository.findAll();
        return temp;
    }
    public Category saveOrUpdateCategory(Category c){
        Category data= categoryRepository.save(c);
        return  data;
    }
    public Category getIdCategory( Integer id ){
        Category get= categoryRepository.findOne(id);
        return get;
    }
    public void hapusCategory(Integer id){
        categoryRepository.delete(id);
    }
}
