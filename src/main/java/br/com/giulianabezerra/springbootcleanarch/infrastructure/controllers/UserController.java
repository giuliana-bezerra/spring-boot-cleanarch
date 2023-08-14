package br.com.giulianabezerra.springbootcleanarch.infrastructure.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.giulianabezerra.springbootcleanarch.application.usecases.CreateUserInteractor;
import br.com.giulianabezerra.springbootcleanarch.domain.entity.User;

@RestController
@RequestMapping("users")
public class UserController {
  private final CreateUserInteractor createUserUseCase;
  private final UserDTOMapper userDTOMapper;

  public UserController(CreateUserInteractor createUserUseCase,
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
