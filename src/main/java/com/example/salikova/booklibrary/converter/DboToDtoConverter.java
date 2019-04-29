package com.example.salikova.booklibrary.converter;

public interface DboToDtoConverter<Dbo, Dto> {

    Dbo convertToDbo(final Dto dto);
    Dto convertToDto(final Dbo dbo);
}