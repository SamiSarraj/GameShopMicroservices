package com.gameshop.gamesinfoservice.controller;

import com.gameshop.gamesinfoservice.domain.GamesInfo;
import com.gameshop.gamesinfoservice.service.GamesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/game")
public class GamesInfoController {

    private GamesInfoService gamesInfoService;
    @Autowired
    public GamesInfoController(GamesInfoService gamesInfoService) {
        this.gamesInfoService = gamesInfoService;
    }

    @GetMapping(value = "/{name}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<GamesInfo> getGameInfo(@PathVariable String name) {
        return Optional.ofNullable(gamesInfoService.getGameInfo(name));
    }

}
