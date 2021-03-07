package com.gameshop.userservice.service;

import com.gameshop.userservice.domain.User;
import com.gameshop.userservice.domain.UserInformation;
import com.gameshop.userservice.dto.UserDto;
import com.gameshop.userservice.repository.UserInformationRepository;
import com.gameshop.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;
    private UserInformationRepository userInformationRepository;

    @Autowired
    public UserService(UserRepository userRepository, UserInformationRepository userInformationRepository) {
        this.userRepository = userRepository;
        this.userInformationRepository = userInformationRepository;
    }

    public void addNewUser(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        UserInformation userInformation = new UserInformation();
        user.setUserInformation(userInformation);
        userInformationRepository.save(userInformation);
        userRepository.save(user);
    }
    public Optional<User> getUser(String username) {
        return userRepository.findUserByUsername(username);
    }

}
