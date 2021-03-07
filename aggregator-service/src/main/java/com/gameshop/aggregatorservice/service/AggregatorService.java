package com.gameshop.aggregatorservice.service;

import com.gameshop.aggregatorservice.domain.*;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AggregatorService {
    private WebClient.Builder webClient;
    @Autowired
    public AggregatorService(@Qualifier("getWebClient") WebClient.Builder webClient) {
        this.webClient = webClient;
    }
    public UserGameRatings getUserGamesRatings(String username) {
        User user = getUser(username);
        UserRatings ratings = getUserRatings(username);
        List<GameRating> gameRating = ratings.getUserRatings()
                .stream()
                .map(rating -> {
                GamesInfo gamesInfo = getGamesInfo(rating.getMovieName());
                return new GameRating(gamesInfo.getName(),
                        gamesInfo.getDesc(),
                        gamesInfo.getReleaseDate(),
                        rating.getRating()
                        );
                }).collect(Collectors.toList());
        return new UserGameRatings(user, gameRating);

    }
    @HystrixCommand(fallbackMethod = "notAvailableResource")
    private User getUser(String username) {
        return webClient.build()
                .get()
                .uri("http://user-service/user/"+username)
                .retrieve()
                .bodyToMono(User.class)
                .block();
    }
    @HystrixCommand(fallbackMethod = "notAvailableResource")
    private UserRatings getUserRatings(String username) {
        return webClient.build()
                .get()
                .uri("http://games-rating-service/games-rating/"+username)
                .retrieve()
                .bodyToMono(UserRatings.class)
                .block();
    }
    @HystrixCommand(fallbackMethod = "notAvailableResource")
    private GamesInfo getGamesInfo(String name) {
        return webClient.build()
                .get()
                .uri("http://games-info-service/game/"+name)
                .retrieve()
                .bodyToMono(GamesInfo.class)
                .block();
    }
    public String notAvailableResource() {
        return "not available resource";
    }
}
