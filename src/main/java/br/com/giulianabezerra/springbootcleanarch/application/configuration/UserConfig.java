package br.com.giulianabezerra.springbootcleanarch.application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.giulianabezerra.springbootcleanarch.application.adapters.controllers.UserDTOMapper;
import br.com.giulianabezerra.springbootcleanarch.application.adapters.gateway.UserEntityMapper;
import br.com.giulianabezerra.springbootcleanarch.application.adapters.gateway.UserRepositoryGateway;
import br.com.giulianabezerra.springbootcleanarch.application.adapters.persistence.UserRepository;
import br.com.giulianabezerra.springbootcleanarch.application.core.usecase.CreateUserUseCase;
import br.com.giulianabezerra.springbootcleanarch.application.core.usecase.UserGateway;
import br.com.giulianabezerra.springbootcleanarch.application.core.usecase.UserMapper;

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
