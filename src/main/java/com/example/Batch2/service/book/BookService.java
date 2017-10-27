package com.example.Batch2.service.book;

import com.example.Batch2.model.employee.book.Book;
import com.example.Batch2.repository.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public List<Book> showAllBook(){
        List<Book> data= bookRepository.findAll();
        return data;
    }
    public Book saveOrUpdate(Book b){
        Book simpan=bookRepository.save(b);
        return simpan;
    }
    public Book getIdBook(Integer id){
        Book get= bookRepository.findOne(id);
        return get;
    }
    public void hapusBuku(Integer in){
        bookRepository.delete(in);
    }
}
