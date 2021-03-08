package com.gameshop.gamesinfoservice.service;

import com.gameshop.gamesinfoservice.domain.GamesInfo;
import com.gameshop.gamesinfoservice.repository.GamesInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GamesInfoService {

    private GamesInfoRepository gamesInfoRepository;
    @Autowired
    public GamesInfoService(GamesInfoRepository gamesInfoRepository) {
        this.gamesInfoRepository = gamesInfoRepository;
    }

    public GamesInfo getGameInfo(String name) {
        return gamesInfoRepository.findGamesInfoByName(name);
    }
}
