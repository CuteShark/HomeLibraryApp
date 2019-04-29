package com.example.salikova.booklibrary.converter;

import com.example.salikova.booklibrary.dbo.BookDBO;
import com.example.salikova.booklibrary.dto.BookDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
/*
 * @author Natalya Salikova
 */
public class BookConverter implements DboToDtoConverter<BookDBO, BookDTO> {
    @Override
    public BookDBO convertToDbo(final BookDTO bookDTO) {
        final BookDBO bookDBO = new BookDBO();
        BeanUtils.copyProperties(bookDTO, bookDBO);
        return bookDBO;
    }

    @Override
    public BookDTO convertToDto(final BookDBO bookDBO) {
        final BookDTO bookDTO = new BookDTO();
        BeanUtils.copyProperties(bookDBO, bookDTO);
        return bookDTO;
    }
}
