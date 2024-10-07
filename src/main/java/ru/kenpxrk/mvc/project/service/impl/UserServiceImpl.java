package ru.kenpxrk.mvc.project.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kenpxrk.mvc.project.dto.UserPostDto;
import ru.kenpxrk.mvc.project.mapper.UserMapper;
import ru.kenpxrk.mvc.project.model.UserEntity;
import ru.kenpxrk.mvc.project.repository.UserRepository;
import ru.kenpxrk.mvc.project.service.UserService;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper mapper;

    @Transactional(readOnly = true)
    @Override
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public UserEntity findUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Transactional
    @Override
    public void addUser(UserPostDto userPostDto) {
        UserEntity user = mapper.toUserEntity(userPostDto);
        userRepository.save(user);
    }

    @Transactional
    @Override
    public void updateUser(UserPostDto userPatchDto, Long id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow();
        mapper.updateUserEntityFromDto(userPatchDto, userEntity);
        userRepository.save(userEntity);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
