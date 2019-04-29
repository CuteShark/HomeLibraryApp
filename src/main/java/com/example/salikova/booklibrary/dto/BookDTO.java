package com.example.salikova.booklibrary.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Natalya Salikova
 */
@Data
@NoArgsConstructor
public class BookDTO {
    private Long id;
    private String author;
    private String title;
}
