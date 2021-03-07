package com.gameshop.gamesratingservice.repository;

import com.gameshop.gamesratingservice.domain.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRatingRepository extends CrudRepository<Rating, Long> {
    List<Rating> findAllByUsername(String username);
}
