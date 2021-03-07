package com.gameshop.aggregatorservice.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UserRatings {
    private List<Rating> userRatings;
}
