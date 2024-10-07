package ru.kenpxrk.mvc.project.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.kenpxrk.mvc.project.dto.UserPostDto;
import ru.kenpxrk.mvc.project.model.UserEntity;


@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "name", source = "name")
    @Mapping(target = "age", source = "age")
    @Mapping(target = "email", source = "email")
    UserEntity toUserEntity(UserPostDto userPostDto);

    @Mapping(target = "name", source = "name", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "age", source = "age", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "email", source = "email", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserEntityFromDto(UserPostDto userPatchDto, @MappingTarget UserEntity entity);


}