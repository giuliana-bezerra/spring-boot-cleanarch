package br.com.giulianabezerra.springbootcleanarch.application.usecases;

import br.com.giulianabezerra.springbootcleanarch.domain.entity.User;
import br.com.giulianabezerra.springbootcleanarch.infrastructure.controllers.CreateUserRequest;

public class UserMapper {
  User toUserDomainObj(CreateUserRequest userDTO) {
    return new User(userDTO.username(), userDTO.password(), userDTO.email());
  }
}
