package br.com.giulianabezerra.springbootcleanarch.application.gateways;

import br.com.giulianabezerra.springbootcleanarch.domain.entity.User;

public interface UserGateway {
  User createUser(User user);
}
