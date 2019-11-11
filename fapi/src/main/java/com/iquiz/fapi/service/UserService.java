package com.iquiz.fapi.service;

import com.iquiz.fapi.models.User;

import java.util.List;

public interface UserService {

    User findByLogin(String login);
    List<User> findAll();
    User save(User user);
}
