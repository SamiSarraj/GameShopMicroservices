package com.gameshop.gamesinfoservice.repository;

import com.gameshop.gamesinfoservice.domain.GamesInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GamesInfoRepository extends CrudRepository<GamesInfo, Long> {
    GamesInfo findGamesInfoByName(String name);
}
