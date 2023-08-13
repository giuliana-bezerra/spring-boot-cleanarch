package br.com.giulianabezerra.springbootcleanarch.application.infrastructure.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.giulianabezerra.springbootcleanarch.application.core.entity.User;
import br.com.giulianabezerra.springbootcleanarch.application.core.usecase.CreateUserUseCase;

@RestController
@RequestMapping("users")
public class UserController {
  private final CreateUserUseCase createUserUseCase;
  private final UserDTOMapper userDTOMapper;

  public UserController(CreateUserUseCase createUserUseCase,
      UserDTOMapper userDTOMapper) {
    this.createUserUseCase = createUserUseCase;
    this.userDTOMapper = userDTOMapper;
  }

  @PostMapping
  public CreateUserResponse createUser(@RequestBody CreateUserRequest request) {
    User user = createUserUseCase.createUser(request);
    return userDTOMapper.toResponse(user);
  }
}
