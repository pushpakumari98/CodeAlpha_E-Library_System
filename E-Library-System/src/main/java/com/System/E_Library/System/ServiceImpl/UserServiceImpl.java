package com.System.E_Library.System.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.System.E_Library.System.Dto.UserDto;
import com.System.E_Library.System.Dto.UserSaveDto;
import com.System.E_Library.System.Dto.UserUpdateDto;
import com.System.E_Library.System.Entity.User;
import com.System.E_Library.System.Repo.UserRepo;
import com.System.E_Library.System.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public String addUser(UserSaveDto userSaveDto) {
        User user = new User(
            userSaveDto.getUserName(),
            userSaveDto.getUserEmail()
        );
        userRepo.save(user);
        return user.getUserName();        
    
    }

    @Override
    public String updateUser(UserUpdateDto userUpdateDto) {
        return userRepo.findById(userUpdateDto.getUserId()).map(user -> {
            user.setUserName(userUpdateDto.getUserName());
            user.setUserEmail(userUpdateDto.getUserEmail());
            userRepo.save(user);
            return "User updated: " + user.getUserName();
        }).orElse("User ID does not exist!");
    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> users = userRepo.findAll();
        List<UserDto> userDtoList = new ArrayList<>();

        for (User user : users) {
            UserDto userDto = new UserDto();
            userDto.setUserId(user.getUserId());
            userDto.setUserName(user.getUserName());
            userDto.setUserEmail(user.getUserEmail());
            userDtoList.add(userDto);
        }
        return userDtoList;
    }


    @Override
    public String deleteUser(int id) {
        if (userRepo.existsById(id)) {
            userRepo.deleteById(id);
            return "User with ID " + id + " has been deleted.";
        } else {
            return "User ID not found!";
        }
    }
}
