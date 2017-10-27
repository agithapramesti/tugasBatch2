package com.example.Batch2.controller.employee;

import com.example.Batch2.model.employee.book.Book;
import com.example.Batch2.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableAutoConfiguration
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/book")
    public String BookList(Model model){
        model.addAttribute("book",bookService.showAllBook());
        return "book";
    }
    @RequestMapping(value = "/book/createBook", method = RequestMethod.GET)
    public String tampilFormBuku(Model model){
        model.addAttribute("book",new Book());
        return "createBook";
    }
    @RequestMapping(value = "/book/createBook", method = RequestMethod.POST)
    public String tampilFormBuku(Model model, Book book){
        model.addAttribute("book",bookService.saveOrUpdate(book));
        return "redirect:/book";
    }
    @RequestMapping(value = "/book/edit/{id}",method = RequestMethod.GET)
    public String editBuku(@PathVariable Integer id,Model model){
        model.addAttribute("book",bookService.getIdBook(id));
        return "createBook";
    }
    @RequestMapping(value = "/book/hapus/{id}",method = RequestMethod.GET)
    public String hapusBuku(@PathVariable Integer id,Model model){
        bookService.hapusBuku(id);
        return "redirect:/book";
    }
}
