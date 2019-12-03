package com.iquiz.backend.service.impl;

import com.iquiz.backend.entity.UsersEntity;
import com.iquiz.backend.repository.UserRepository;
import com.iquiz.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserServiceImpl implements UserService {
    private UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UsersEntity saveUser(UsersEntity usersEntity) {
        return repository.save(usersEntity);
    }

    @Override
    public Optional<UsersEntity> getUserById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Iterable<UsersEntity> getAllTest() {
        return repository.findAll();
    }

    @Override
    public void deleteTest(Integer id) {
        repository.deleteById(id);
    }
}
