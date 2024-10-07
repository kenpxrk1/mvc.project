package ru.kenpxrk.mvc.project.service;

import ru.kenpxrk.mvc.project.dto.UserPostDto;
import ru.kenpxrk.mvc.project.model.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> findAll();

    UserEntity findUserById(Long id);

    void addUser(UserPostDto userPostDto);

    void updateUser(UserPostDto userPatchDto, Long id);

    void deleteUser(Long id);
}
