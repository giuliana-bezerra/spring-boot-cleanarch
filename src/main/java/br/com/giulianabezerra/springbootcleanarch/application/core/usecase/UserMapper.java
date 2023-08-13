package br.com.giulianabezerra.springbootcleanarch.application.core.usecase;

import br.com.giulianabezerra.springbootcleanarch.application.adapters.controllers.CreateUserRequest;
import br.com.giulianabezerra.springbootcleanarch.application.core.entity.User;

public class UserMapper {
  User toUserDomainObj(CreateUserRequest userDTO) {
    return new User(userDTO.username(), userDTO.password(), userDTO.email());
  }
}
