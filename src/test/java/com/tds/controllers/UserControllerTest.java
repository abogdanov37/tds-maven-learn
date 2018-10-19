package com.tds.controllers;

import com.tds.dal.model.User;
import com.tds.dal.repositories.UserRepository;
import com.tds.dto.DtoUser;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserControllerTest {


    UserRepository rep = new UserRepository() {
        @Override
        public <S extends User> S save(S s) {
            return null;
        }

        @Override
        public <S extends User> Iterable<S> saveAll(Iterable<S> iterable) {
            return null;
        }

        @Override
        public Optional<User> findById(Long aLong) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Long aLong) {
            return false;
        }

        @Override
        public Iterable<User> findAll() {
            List<User> users = new ArrayList<>();
            users.add(new User("Петя", "Иванов"));
            users.add(new User("Петя", "Сидовов"));
            return users;
        }

        @Override
        public Iterable<User> findAllById(Iterable<Long> iterable) {
            return null;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Long aLong) {

        }

        @Override
        public void delete(User user) {

        }

        @Override
        public void deleteAll(Iterable<? extends User> iterable) {

        }

        @Override
        public void deleteAll() {

        }
    };

    private  UserController controller;
    @Before
    public void setUp() throws Exception {

        controller = new UserController(rep);
    }

    @After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getAllUsers() {
        List<DtoUser> users = controller.getAllUsers();
        assertEquals(users.size(), 2);
    }
}