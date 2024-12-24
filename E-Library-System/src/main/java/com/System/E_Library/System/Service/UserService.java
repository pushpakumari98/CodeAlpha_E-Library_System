package com.System.E_Library.System.Service;

import java.util.List;

import com.System.E_Library.System.Dto.UserDto;
import com.System.E_Library.System.Dto.UserSaveDto;
import com.System.E_Library.System.Dto.UserUpdateDto;

public interface UserService {

    String addUser(UserSaveDto userSaveDto);

    String deleteUser(int id);

    String updateUser(UserUpdateDto userUpdateDto);

    List<UserDto> getAllUser();
    
}
