package com.gameshop.userservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(unique = true)
    private String username;
    @OneToOne
    @JoinColumn(name = "userInformation_id")
    private UserInformation userInformation;
}
