package ru.kenpxrk.mvc.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kenpxrk.mvc.project.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
