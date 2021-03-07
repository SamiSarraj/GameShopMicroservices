package com.gameshop.aggregatorservice.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class User {
    @NotNull
    private String username;
    private UserInformation userInformation;
}
