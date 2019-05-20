package com.example.salikova.booklibrary.service;

import com.example.salikova.booklibrary.converter.BookConverter;
import com.example.salikova.booklibrary.dto.BookDto;
import com.example.salikova.booklibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Natalya Salikova
 */
@Service
public class BookService {

    private final BookRepository bookRepository;
    private final BookConverter bookConverter;

    @Autowired
    public BookService(final BookRepository bookRepository, final BookConverter bookConverter) {
        this.bookRepository = bookRepository;
        this.bookConverter = bookConverter;
    }

    public void createBook(final BookDto bookDto) {
        bookRepository.save(bookConverter.convertToDbo(bookDto));
    }

    public List<BookDto> getBookList() {
        return bookRepository.findAll().stream().map(bookConverter::convertToDto).collect(Collectors.toList());
    }
}