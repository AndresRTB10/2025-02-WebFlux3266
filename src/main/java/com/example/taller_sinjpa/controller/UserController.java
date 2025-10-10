package com.example.taller_sinjpa.controller;


import com.example.taller_sinjpa.dto.UserDTO;
import com.example.taller_sinjpa.model.User;
import com.example.taller_sinjpa.service.UserService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/users"})
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserDTO createUser(@RequestBody User user) {
        return this.userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @GetMapping({"/{id}"})
    public User getUserById(@PathVariable Long id) {
        return this.userService.getUserById(id);
    }

    @GetMapping({"/params"})
    public Map<String, String> getNombreCompleto(@RequestParam String nombre, @RequestParam String apellido) {
        Map<String, String> response = new HashMap();
        response.put("nombreCompleto", nombre + " " + apellido);
        return response;
    }
}

