package com.example.Batch2.repository.book;

import com.example.Batch2.model.employee.book.Book;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class BookRepolmpl implements RepoBookCustom {
    @Autowired
    EntityManager entityManager;
    @Override
    public List<Book> getAllBook(){
        List<Book> lst= this.entityManager.createNativeQuery(
                "SELECT * from Book", Book.class
        ).getResultList();
        return lst;
    }
}
