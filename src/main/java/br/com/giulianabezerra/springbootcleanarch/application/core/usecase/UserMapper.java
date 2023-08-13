package br.com.giulianabezerra.springbootcleanarch.application.core.usecase;

import br.com.giulianabezerra.springbootcleanarch.application.core.entity.User;
import br.com.giulianabezerra.springbootcleanarch.application.infrastructure.controllers.CreateUserRequest;

public class UserMapper {
  User toUserDomainObj(CreateUserRequest userDTO) {
    return new User(userDTO.username(), userDTO.password(), userDTO.email());
  }
}
