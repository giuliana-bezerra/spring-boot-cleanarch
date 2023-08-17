package br.com.giulianabezerra.springbootcleanarch.application.usecases;

import br.com.giulianabezerra.springbootcleanarch.application.gateways.UserGateway;
import br.com.giulianabezerra.springbootcleanarch.domain.entity.User;

public class CreateUserInteractor {
  private final UserGateway userGateway;

  public CreateUserInteractor(UserGateway createUser) {
    this.userGateway = createUser;
  }

  public User createUser(User user) {
    return userGateway.createUser(user);
  }
}
