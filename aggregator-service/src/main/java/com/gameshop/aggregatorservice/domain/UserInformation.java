package com.gameshop.aggregatorservice.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;


@Data
@NoArgsConstructor
public class UserInformation {
    //@NotEmpty(message = "Full name cant be empty!")
    private String fullName;
    //@NotEmpty(message = "Birthday cant be empty!")
    private LocalDate birthday;
    //@Email(message = "Email cant be empty!")
    private String email;
    private User user;

}
