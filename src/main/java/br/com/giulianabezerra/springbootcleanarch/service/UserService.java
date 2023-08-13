package br.com.giulianabezerra.springbootcleanarch.service;

import org.springframework.stereotype.Service;

import br.com.giulianabezerra.springbootcleanarch.model.User;
import br.com.giulianabezerra.springbootcleanarch.repository.UserRepository;

@Service
public class UserService {
  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User create(User user) {
    return userRepository.save(user);
  }
}
