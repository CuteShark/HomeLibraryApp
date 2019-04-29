package com.example.salikova.booklibrary.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Natalya Salikova
 */
@Data
@NoArgsConstructor
public class PersonDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
}
