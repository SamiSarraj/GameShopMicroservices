package com.gameshop.gamesratingservice.controller;

import com.gameshop.gamesratingservice.domain.Rating;
import com.gameshop.gamesratingservice.service.GamesRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/games-rating")
public class GamesRatingController {
    private GamesRatingService gamesRatingService;
    @Autowired
    public GamesRatingController(GamesRatingService gamesRatingService) {
        this.gamesRatingService = gamesRatingService;
    }
@GetMapping("/{username}")
@ResponseStatus(HttpStatus.OK)
public List<Optional<Rating>> getUserRatings(@PathVariable String username) {
    return gamesRatingService.getAllUserRatings(username);
}
}
