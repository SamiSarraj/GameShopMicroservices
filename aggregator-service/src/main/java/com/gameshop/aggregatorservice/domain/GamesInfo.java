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

    public void notAvailableGameInfo() {
        this.name = "NotAvialable";
        this.desc = "NotAvailable";
        this.releaseDate = LocalDate.of(1994,12,6);
    }
}
