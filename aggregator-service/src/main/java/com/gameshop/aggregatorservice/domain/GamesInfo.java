package com.gameshop.aggregatorservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class GamesInfo {

    private String name;
    private String desc;
    private LocalDate releaseDate;
}
