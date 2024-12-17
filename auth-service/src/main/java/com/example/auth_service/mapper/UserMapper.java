package com.example.auth_service.mapper;

import com.example.auth_service.dto.SignUpDto;
import com.example.auth_service.dto.UserDto;
import com.example.auth_service.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto userDto);
}
