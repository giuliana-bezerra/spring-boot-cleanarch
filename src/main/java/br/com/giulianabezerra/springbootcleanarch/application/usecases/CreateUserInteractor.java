package br.com.giulianabezerra.springbootcleanarch.application.usecases;

import br.com.giulianabezerra.springbootcleanarch.application.gateways.UserGateway;
import br.com.giulianabezerra.springbootcleanarch.domain.entity.User;
import br.com.giulianabezerra.springbootcleanarch.infrastructure.controllers.CreateUserRequest;

public class CreateUserInteractor {
  private UserGateway userGateway;
  private UserMapper userMapper;

  public CreateUserInteractor(UserGateway createUser, UserMapper userMapper) {
    this.userGateway = createUser;
    this.userMapper = userMapper;
  }

  public User createUser(CreateUserRequest userDTO) {
    User userDomainObj = userMapper.toUserDomainObj(userDTO);
    return userGateway.createUser(userDomainObj);
  }
}
