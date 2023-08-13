package br.com.giulianabezerra.springbootcleanarch.application.core.usecase;

import br.com.giulianabezerra.springbootcleanarch.application.core.entity.User;

public interface UserGateway {
  User createUser(User user);
}
