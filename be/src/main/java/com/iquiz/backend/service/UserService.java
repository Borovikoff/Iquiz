package com.iquiz.backend.service;

import com.iquiz.backend.entity.UsersEntity;

import java.util.Optional;

public interface UserService {
    UsersEntity saveUser(UsersEntity usersEntity);

    Optional<UsersEntity> getUserById(Integer id);

    Iterable<UsersEntity> getAllTest();

    void deleteTest(Integer id);
}
