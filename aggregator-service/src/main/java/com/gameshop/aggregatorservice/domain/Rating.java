package com.gameshop.aggregatorservice.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class Rating {
    @NotNull
    private String username;
    @NotNull
    private String movieName;
    @NotEmpty(message = "Rating cant be empty!")
    private Integer rating;
}
