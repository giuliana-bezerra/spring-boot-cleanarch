package br.com.giulianabezerra.springbootcleanarch.application.adapters.gateway;

import br.com.giulianabezerra.springbootcleanarch.application.adapters.persistence.UserEntity;
import br.com.giulianabezerra.springbootcleanarch.application.core.entity.User;

public class UserEntityMapper {
  UserEntity toEntity(User userDomainObj) {
    return new UserEntity(userDomainObj.username(), userDomainObj.password(), userDomainObj.email());
  }

  User toDomainObj(UserEntity userEntity) {
    return new User(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
  }

}
