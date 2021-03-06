package com.gameshop.gamesinfoservice.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class GamesInfo {
    @Id
    @GeneratedValue
    private Long id;
    private String desc;
    private LocalDate releaseDate;
}
