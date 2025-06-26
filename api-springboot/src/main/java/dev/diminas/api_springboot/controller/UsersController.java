package dev.diminas.api_springboot.controller;

import dev.diminas.api_springboot.entities.Users;
import dev.diminas.api_springboot.services.UsersServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UsersController {

    private final UsersServices services;
    public UsersController(UsersServices services) {
        this.services = services;
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Users> save(@RequestBody Users users){
        Users u = services.save(users);
        return ResponseEntity.ok(u);
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<Users>> list(){
        List<Users> listUsers = services.findAll();
        return ResponseEntity.ok(listUsers);
    }
}
