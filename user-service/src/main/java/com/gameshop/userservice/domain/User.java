package com.gameshop.userservice.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String username;
    @OneToOne
    @JoinColumn(name = "userInformation_id")
    private UserInformation userInformation;
}
