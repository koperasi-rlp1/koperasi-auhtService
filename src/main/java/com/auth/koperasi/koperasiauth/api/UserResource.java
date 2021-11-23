package com.auth.koperasi.koperasiauth.api;


import com.auth.koperasi.koperasiauth.entity.User;
import com.auth.koperasi.koperasiauth.service.implementation.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(name = "/api")
public class UserResource {

    @Autowired
    private UserServiceImpl service;

    @GetMapping(name = "/getAllUsers")
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok().body(service.getUsers());
    }

    @PostMapping(name = "/saveUser")
    public ResponseEntity<?> saveUser(@RequestBody User user){
        User newUser = service.saveUser(user);
        return ResponseEntity.ok().body(newUser);
    }
}
