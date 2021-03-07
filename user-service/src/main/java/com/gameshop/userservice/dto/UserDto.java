package com.gameshop.userservice.dto;

import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Getter
public class UserDto {
    private String username;
    private String password;
    private String fullName;
    private LocalDate birthday;
    private String email;
}
