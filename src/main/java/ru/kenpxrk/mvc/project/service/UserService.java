package ru.kenpxrk.mvc.project.service;

import ru.kenpxrk.mvc.project.model.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> findAll();

    UserEntity findUserById();

    void addUser();

    void updateUser();

    void deleteUser();
}
