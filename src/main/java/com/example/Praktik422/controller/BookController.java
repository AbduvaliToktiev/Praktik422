package com.example.Praktik422.controller;

import com.example.Praktik422.entity.Book;
import com.example.Praktik422.enums.BookStatus;
import com.example.Praktik422.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/book")
@AllArgsConstructor
@RestController
public class BookController {
    BookService bookService;

    @PostMapping("/save")
    public Book save() {
        Book book = Book.builder()
                .author("123")
                .bookStatus(BookStatus.FREE)
                .name("asd")
                .build();
        return bookService.save(book);
    }
}
