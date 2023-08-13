package br.com.giulianabezerra.springbootcleanarch.application.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.giulianabezerra.springbootcleanarch.application.core.usecase.CreateUserUseCase;
import br.com.giulianabezerra.springbootcleanarch.application.core.usecase.UserGateway;
import br.com.giulianabezerra.springbootcleanarch.application.core.usecase.UserMapper;
import br.com.giulianabezerra.springbootcleanarch.application.infrastructure.controllers.UserDTOMapper;
import br.com.giulianabezerra.springbootcleanarch.application.infrastructure.gateway.UserEntityMapper;
import br.com.giulianabezerra.springbootcleanarch.application.infrastructure.gateway.UserRepositoryGateway;
import br.com.giulianabezerra.springbootcleanarch.application.infrastructure.persistence.UserRepository;

@Configuration
public class UserConfig {
  @Bean
  CreateUserUseCase createUserCase(UserGateway userGateway, UserMapper userMapper) {
    return new CreateUserUseCase(userGateway, userMapper);
  }

  @Bean
  UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
    return new UserRepositoryGateway(userRepository, userEntityMapper);
  }

  @Bean
  UserMapper userMapper() {
    return new UserMapper();
  }

  @Bean
  UserEntityMapper userEntityMapper() {
    return new UserEntityMapper();
  }

  @Bean
  UserDTOMapper UserDTOMapper() {
    return new UserDTOMapper();
  }
}
