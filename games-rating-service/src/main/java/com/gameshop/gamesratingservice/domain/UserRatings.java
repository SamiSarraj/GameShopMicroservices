package com.gameshop.gamesratingservice.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UserRatings {
    private List<Rating> userRatings;
}
