package com.gameshop.aggregatorservice.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class GameRating {
    private String gameName;
    private String gameDesc;
    private Integer rating;
    private LocalDate releaseDate;

    public GameRating(String name, String desc, LocalDate releaseDate, Integer rating) {
        this.gameName= name;
        this.gameDesc = desc;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }
}
