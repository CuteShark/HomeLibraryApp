package com.example.salikova.booklibrary.repository;

import com.example.salikova.booklibrary.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
