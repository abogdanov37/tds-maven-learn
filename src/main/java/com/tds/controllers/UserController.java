package com.tds.controllers;

import com.tds.dal.repositories.UserRepository;
import com.tds.dto.DtoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class UserController {

    private final UserRepository repository;

    @Autowired
    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/users")
    public List<DtoUser> getAllUsers() {
        return StreamSupport.stream(repository.findAll().spliterator(), true)
                .map(u -> new DtoUser(u.getId(), u.getFirstName(), u.getLastName()))
                .collect(Collectors.toList());
    }

}
