package com.gameshop.gamesratingservice.service;

import com.gameshop.gamesratingservice.domain.Rating;
import com.gameshop.gamesratingservice.domain.UserRatings;
import com.gameshop.gamesratingservice.repository.GameRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GamesRatingService {

    private GameRatingRepository gameRatingRepository;
    @Autowired
    public GamesRatingService(GameRatingRepository gameRatingRepository) {
        this.gameRatingRepository = gameRatingRepository;
    }
    public Optional<UserRatings> getAllUserRatings(String username) {
        UserRatings userRatings = new UserRatings();
        userRatings.setUserRatings(gameRatingRepository.findAllByUsername(username));
        return Optional.of(userRatings);
    }
}
