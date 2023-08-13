package br.com.giulianabezerra.springbootcleanarch.application.adapters.controllers;

import br.com.giulianabezerra.springbootcleanarch.application.core.entity.User;

public class UserDTOMapper {
  CreateUserResponse toResponse(User user) {
    return new CreateUserResponse(user.username(), user.email());
  }
}
