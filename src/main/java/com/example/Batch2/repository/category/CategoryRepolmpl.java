package com.example.Batch2.repository.category;

import com.example.Batch2.model.employee.category.Category;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class CategoryRepolmpl implements RepoCategoryCustom {
    @Autowired
    EntityManager entityManager;
    @Override
    public List<Category> getAllCategory(){
        List<Category> data= this.entityManager.createNativeQuery(
                "select * from Category", Category.class
        ).getResultList();
        return data;
    }
}
