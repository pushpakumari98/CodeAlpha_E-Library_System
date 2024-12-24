package com.System.E_Library.System.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserUpdateDto {
    private int userId;
    private String userName;
    private String userEmail;
}
