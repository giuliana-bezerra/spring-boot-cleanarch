package br.com.giulianabezerra.springbootcleanarch.infrastructure.controllers;

import br.com.giulianabezerra.springbootcleanarch.domain.entity.User;

public class UserDTOMapper {
  CreateUserResponse toResponse(User user) {
    return new CreateUserResponse(user.username(), user.email());
  }
}
