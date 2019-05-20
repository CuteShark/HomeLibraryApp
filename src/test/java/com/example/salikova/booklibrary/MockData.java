package com.example.salikova.booklibrary;

import com.example.salikova.booklibrary.dbo.BookEntity;
import com.example.salikova.booklibrary.dto.BookDto;

public class MockData {

    public static BookEntity createBookEntity() {
        final BookEntity bookEntity = new BookEntity();
        bookEntity.setTitle("The Catcher In The Rye");
        bookEntity.setAuthor("Jerome Salinger");
        return bookEntity;
    }

    public static BookDto createBookDto() {
        final BookDto bookDto = new BookDto();
        bookDto.setTitle("Still Me");
        bookDto.setAuthor("Jojo Moyes");
        return bookDto;
    }
}
