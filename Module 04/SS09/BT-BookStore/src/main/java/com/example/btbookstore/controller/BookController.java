package com.example.btbookstore.controller;

import com.example.btbookstore.model.Book;
import com.example.btbookstore.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.Name;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping("book")
    public String getBook(Model model){
        model.addAttribute("books", bookService.findAll());
        return "book";
    }

    @GetMapping("/{id}/borrow")
    public String borrowBook(@PathVariable Long id, Model model){
        model.addAttribute("book",bookService.findById(id));
        return "submit";
    }

    @PostMapping( "/submit")
    public String submitBorrow(@ModelAttribute("book") Book book, RedirectAttributes redirectAttributes) throws Exception{
        bookService.borrowBook(book);
        if (book.getAmount()<0){
            bookService.payBook(book);
            throw new Exception();
        }
        redirectAttributes.addFlashAttribute("mess01", "Borrowing Book Successfully!!");
        return "redirect:/book";
    }

    @GetMapping("/{id}/pay")
    public String payBook(@PathVariable("id") Long id, Model model){
        model.addAttribute("book",bookService.findById(id));
        return "submitpay";
    }

    @PostMapping( "/submitpay")
    public String submitPay(@ModelAttribute("book") Book book, RedirectAttributes redirectAttributes) throws Exception{
        bookService.payBook(book);
        if (book.getAmount()>book.getCount()){
            bookService.borrowBook(book);
            throw new Exception();
        }
        redirectAttributes.addFlashAttribute("mess02", "Returning Book Successfully!!");
        return "redirect:/book";
    }
}
