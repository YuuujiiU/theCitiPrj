package com.citizen.citizenprj.service.impl;

import org.springframework.stereotype.Service;

import com.citizen.citizenprj.model.User;
import com.citizen.citizenprj.repository.UserRepository;
import com.citizen.citizenprj.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        // TODO Auto-generated method stub
        // service layer to database
        return userRepository.save(user);
    }

}
