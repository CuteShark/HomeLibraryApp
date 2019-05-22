package com.example.salikova.booklibrary.controller;

import com.example.salikova.booklibrary.dto.BookDto;
import com.example.salikova.booklibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(final BookService personService) {
        this.bookService = personService;
    }

    @PostMapping("/create")
    public String createPerson(@RequestBody final BookDto bookDto) {
        bookService.createBook(bookDto);
        return "Book created";
    }

    @GetMapping("/list")
    public List<BookDto> getAllBooks() {
        return bookService.getBookList();
    }
}
