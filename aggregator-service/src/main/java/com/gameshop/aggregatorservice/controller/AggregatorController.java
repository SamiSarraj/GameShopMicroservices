package com.gameshop.aggregatorservice.controller;

import com.gameshop.aggregatorservice.domain.UserGameRatings;
import com.gameshop.aggregatorservice.service.AggregatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/gameshop")
public class AggregatorController {


    private AggregatorService aggregatorService;
    @Autowired
    public AggregatorController(AggregatorService aggregatorService) {
        this.aggregatorService = aggregatorService;
    }
    @GetMapping("/{username}")
    @ResponseStatus(HttpStatus.OK)
    public UserGameRatings getUserGamesRatings(@PathVariable String username) {
        return aggregatorService.getUserGamesRatings(username);
    }
}
