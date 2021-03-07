package com.gameshop.userservice.repository;

import com.gameshop.userservice.domain.UserInformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInformationRepository extends CrudRepository<UserInformation, Long> {
}
