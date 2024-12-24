package com.System.E_Library.System.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserSaveDto {
    private String userName;
    private String userEmail;
    
    
    public String getUserName() {
            return userName;
        }
    public void setUserName(String userName) {
            this.userName = userName;
    }
    public String getUserEmail() {
       return userEmail;
    }
    public void setUserEmail(String userName) {
        this.userName = userName;
    }
}
