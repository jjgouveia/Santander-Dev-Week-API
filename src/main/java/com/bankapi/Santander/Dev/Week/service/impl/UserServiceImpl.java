package com.bankapi.Santander.Dev.Week.service.impl;

import com.bankapi.Santander.Dev.Week.domain.model.User;
import com.bankapi.Santander.Dev.Week.domain.repository.UserRepository;
import com.bankapi.Santander.Dev.Week.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service // This annotation is used to mark the class as a service provider.
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository; // This is a dependency injection.

  public UserServiceImpl(UserRepository userRepository) {
    // This is a constructor injection.
    this.userRepository = userRepository;
  }

  @Override
  public User findById(Long id) {
    return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
  }

  @Override
  public User create(User user) {
    if(userRepository.existsByAccountNumber(user.getAccount().getNumber()))
      throw new IllegalArgumentException("Essa conta já existe");

    return userRepository.save(user);
  }
}
