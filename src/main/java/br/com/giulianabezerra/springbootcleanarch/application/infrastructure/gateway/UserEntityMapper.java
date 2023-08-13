package br.com.giulianabezerra.springbootcleanarch.application.infrastructure.gateway;

import br.com.giulianabezerra.springbootcleanarch.application.core.entity.User;
import br.com.giulianabezerra.springbootcleanarch.application.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
  UserEntity toEntity(User userDomainObj) {
    return new UserEntity(userDomainObj.username(), userDomainObj.password(), userDomainObj.email());
  }

  User toDomainObj(UserEntity userEntity) {
    return new User(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
  }

}
