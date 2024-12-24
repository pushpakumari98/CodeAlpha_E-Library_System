package com.System.E_Library.System.Service;

import java.util.List;

import com.System.E_Library.System.Dto.AuthorDto;
import com.System.E_Library.System.Dto.AuthorSaveDto;
import com.System.E_Library.System.Dto.AuthorUpdateDto;

public interface AuthorService {

    String addAuthor(AuthorSaveDto authorSaveDto);

    List<AuthorDto> getAllAuthor();

    String updateAuthor(AuthorUpdateDto authorUpdateDto);

    String deleteAuthor(int id);
}
