package com.gameshop.gamesinfoservice.service;

import com.gameshop.gamesinfoservice.domain.GamesInfo;
import com.gameshop.gamesinfoservice.repository.GamesInfoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GamesInfoService {
    private GamesInfoRepository gamesInfoRepository;
    public Optional<GamesInfo> getGameInfo(String name) {
        return gamesInfoRepository.findGamesInfoByName(name);
    }
}
