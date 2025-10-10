package com.example.taller_sinjpa.service;


import com.example.taller_sinjpa.dto.UserDTO;
import com.example.taller_sinjpa.model.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final List<User> usuarios = new ArrayList();

    public UserServiceImpl() {
        this.usuarios.add(new User(1L, "Carlos", "Perez", "carlos@mail.com"));
        this.usuarios.add(new User(2L, "Ana", "Lopez", "ana@mail.com"));
        this.usuarios.add(new User(3L, "Luis", "Martinez", "luis@mail.com"));
    }

    public UserDTO createUser(User user) {
        this.usuarios.add(user);
        return new UserDTO(user.getNombre(), user.getApellido());
    }

    public List<User> getAllUsers() {
        return this.usuarios;
    }

    public User getUserById(Long id) {
        return (User)this.usuarios.stream().filter((u) -> u.getId().equals(id)).findFirst().orElse((User) null);
    }
}