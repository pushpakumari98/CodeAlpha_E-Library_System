package com.System.E_Library.System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.System.E_Library.System.Dto.UserDto;
import com.System.E_Library.System.Dto.UserSaveDto;
import com.System.E_Library.System.Dto.UserUpdateDto;
import com.System.E_Library.System.Service.UserService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {
     @Autowired
     private UserService userService;


    @PostMapping(path="/save")
    public String saveUser(@RequestBody UserSaveDto userSaveDto){
        String userName=userService.addUser(userSaveDto);
        return "Added Successfully";
    }

    @GetMapping(path="/getAllUser")
    public List<UserDto> getAllUser()
    {
        List <UserDto> allUsers=userService.getAllUser();
        return allUsers;
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody UserUpdateDto userUpdateDto){
       String userName=userService.updateUser(userUpdateDto);
       return userName;
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable(value="id")int id){
        String userName=userService.deleteUser(id);
        return "deleteId";
    }
}


