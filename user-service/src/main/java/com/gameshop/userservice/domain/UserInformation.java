package com.gameshop.userservice.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class UserInformation {
    @Id
    @GeneratedValue
    private Long id;
    @NotEmpty(message = "Full name cant be empty!")
    private String fullName;
    @NotEmpty(message = "Birthday cant be empty!")
    private LocalDate birthday;
    @Email(message = "Email cant be empty!")
    private String email;

}
