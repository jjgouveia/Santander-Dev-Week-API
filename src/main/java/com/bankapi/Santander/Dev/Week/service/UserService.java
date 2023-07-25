package com.bankapi.Santander.Dev.Week.service;

import com.bankapi.Santander.Dev.Week.domain.model.User;

public interface UserService {
  User findById(Long id);
  User create(User user);
}
