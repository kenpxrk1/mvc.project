package ru.kenpxrk.mvc.project.service.impl;

import ru.kenpxrk.mvc.project.model.UserEntity;
import ru.kenpxrk.mvc.project.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<UserEntity> findAll() {
        return List.of();
    }

    @Override
    public UserEntity findUserById() {
        return null;
    }

    @Override
    public void addUser() {

    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }
}
