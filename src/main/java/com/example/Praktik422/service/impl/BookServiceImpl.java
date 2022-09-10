package com.example.Praktik422.service.impl;

import com.example.Praktik422.entity.Book;
import com.example.Praktik422.repository.BookRepository;
import com.example.Praktik422.service.BookService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Data
@Service
public class BookServiceImpl implements BookService {
    BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }
}
