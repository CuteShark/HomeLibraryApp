package com.example.salikova.booklibrary.converter;

import com.example.salikova.booklibrary.dbo.PersonDBO;
import com.example.salikova.booklibrary.dto.PersonDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
/*
 * @author Natalya Salikova
 */
public class PersonConverter implements DboToDtoConverter<PersonDBO, PersonDTO> {
    @Override
    public PersonDBO convertToDbo(final PersonDTO personDTO) {
        final PersonDBO personDBO = new PersonDBO();
        BeanUtils.copyProperties(personDTO, personDBO);
        return personDBO;
    }

    @Override
    public PersonDTO convertToDto(final PersonDBO personDBO) {
        final PersonDTO personDTO = new PersonDTO();
        BeanUtils.copyProperties(personDBO, personDTO);
        return personDTO;
    }
}
