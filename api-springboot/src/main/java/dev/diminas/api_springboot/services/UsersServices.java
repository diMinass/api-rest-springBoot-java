package dev.diminas.api_springboot.services;

import dev.diminas.api_springboot.entities.Users;
import dev.diminas.api_springboot.repositories.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public class UsersServices {

    private final UsersRepository repository;
    public UsersServices(UsersRepository repository) {
        this.repository = repository;
    }

    // create users and save in database
    public Users save(Users users){
        return repository.save(users);
    }

    // list all users in database
    public List<Users> findAll(){
        return repository.findAll();
    }




}
