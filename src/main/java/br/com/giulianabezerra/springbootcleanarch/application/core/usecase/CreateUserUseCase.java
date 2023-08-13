package br.com.giulianabezerra.springbootcleanarch.application.core.usecase;

import br.com.giulianabezerra.springbootcleanarch.application.core.entity.User;
import br.com.giulianabezerra.springbootcleanarch.application.infrastructure.controllers.CreateUserRequest;

public class CreateUserUseCase {
  private UserGateway userGateway;
  private UserMapper userMapper;

  public CreateUserUseCase(UserGateway createUser, UserMapper userMapper) {
    this.userGateway = createUser;
    this.userMapper = userMapper;
  }

  public User createUser(CreateUserRequest userDTO) {
    User userDomainObj = userMapper.toUserDomainObj(userDTO);
    return userGateway.createUser(userDomainObj);
  }
}
