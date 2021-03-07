package com.gameshop.aggregatorservice.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
public class UserGameRatings {
    private User user;
    private List<GameRating> gameRatings;

    public UserGameRatings(User user, List<GameRating> gameRating) {
        this.user = user;
        this.gameRatings = gameRating;
    }
}
