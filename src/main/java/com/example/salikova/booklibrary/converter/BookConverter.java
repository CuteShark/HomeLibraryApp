package com.example.salikova.booklibrary.converter;

import com.example.salikova.booklibrary.dbo.BookEntity;
import com.example.salikova.booklibrary.dto.BookDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
/*
 * @author Natalya Salikova
 */
public class BookConverter implements DboToDtoConverter<BookEntity, BookDto> {
    @Override
    public BookEntity convertToDbo(final BookDto bookDto) {
        final BookEntity bookEntity = new BookEntity();
        BeanUtils.copyProperties(bookDto, bookEntity);
        return bookEntity;
    }

    @Override
    public BookDto convertToDto(final BookEntity bookEntity) {
        final BookDto bookDto = new BookDto();
        BeanUtils.copyProperties(bookEntity, bookDto);
        return bookDto;
    }
}
