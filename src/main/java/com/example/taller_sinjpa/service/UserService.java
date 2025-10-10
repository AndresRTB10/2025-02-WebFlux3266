package com.example.taller_sinjpa.service;


import com.example.taller_sinjpa.dto.UserDTO;
import com.example.taller_sinjpa.model.User;
import java.util.List;

public interface UserService {
    UserDTO createUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);
}

