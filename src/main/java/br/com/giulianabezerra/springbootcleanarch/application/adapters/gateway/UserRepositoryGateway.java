package br.com.giulianabezerra.springbootcleanarch.application.adapters.gateway;

import br.com.giulianabezerra.springbootcleanarch.application.adapters.persistence.UserEntity;
import br.com.giulianabezerra.springbootcleanarch.application.adapters.persistence.UserRepository;
import br.com.giulianabezerra.springbootcleanarch.application.core.entity.User;
import br.com.giulianabezerra.springbootcleanarch.application.core.usecase.UserGateway;

public class UserRepositoryGateway implements UserGateway {
  private final UserRepository userRepository;
  private final UserEntityMapper userEntityMapper;

  public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
    this.userRepository = userRepository;
    this.userEntityMapper = userEntityMapper;
  }

  @Override
  public User createUser(User userDomainObj) {
    UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
    UserEntity savedEntity = userRepository.save(userEntity);

    return userEntityMapper.toDomainObj(savedEntity);
  }

}
