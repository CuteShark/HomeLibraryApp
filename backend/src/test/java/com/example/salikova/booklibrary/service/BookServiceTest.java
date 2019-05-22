package com.example.salikova.booklibrary.service;

import com.example.salikova.booklibrary.MockData;
import com.example.salikova.booklibrary.converter.BookConverter;
import com.example.salikova.booklibrary.entity.BookEntity;
import com.example.salikova.booklibrary.dto.BookDto;
import com.example.salikova.booklibrary.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {
    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;
    @Spy
    private BookConverter bookConverter;

    @Test
    public void createPerson() {
        final BookEntity bookEntity = new BookEntity();
        bookEntity.setTitle("Title");
        bookEntity.setAuthor("Author");

        doReturn(bookEntity).when(bookRepository).save(any(BookEntity.class));

        bookService.createBook(new BookDto());

        verify(bookRepository, times(1)).save(any(BookEntity.class));

    }

    @Test
    public void getPersonsList() {
        final List<BookEntity> findAllResult = new ArrayList<>();
        final BookEntity bookEntity = MockData.createBookEntity();
        findAllResult.add(bookEntity);
        findAllResult.add(bookEntity);
        doReturn(findAllResult).when(bookRepository).findAll();

        final List<BookDto> bookList = bookService.getBookList();

        verify(bookRepository, times(1)).findAll();
        assertEquals(findAllResult.size(), bookList.size());
        for (final BookDto bookDto : bookList) {
            assertEquals(bookEntity.getTitle(), bookDto.getTitle());
            assertEquals(bookEntity.getAuthor(), bookDto.getAuthor());
        }

    }
}
