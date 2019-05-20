package com.example.salikova.booklibrary.converter;

import com.example.salikova.booklibrary.MockData;
import com.example.salikova.booklibrary.dbo.BookEntity;
import com.example.salikova.booklibrary.dto.BookDto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookConverterTest {

    private final BookConverter bookConverter = new BookConverter();

    @Test
    public void convertToDto() {
        final BookEntity bookEntity = MockData.createBookEntity();
        final BookDto bookDto = bookConverter.convertToDto(bookEntity);
        assertEquals(bookEntity.getTitle(), bookDto.getTitle());
        assertEquals(bookEntity.getAuthor(), bookDto.getAuthor());
    }

    @Test
    public void convertToDbo() {
        final BookDto bookDto = MockData.createBookDto();
        final BookEntity bookEntity = bookConverter.convertToDbo(bookDto);
        assertEquals(bookDto.getTitle(), bookEntity.getTitle());
        assertEquals(bookDto.getAuthor(), bookEntity.getAuthor());
    }
}
