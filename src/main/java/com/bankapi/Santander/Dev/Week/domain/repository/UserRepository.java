package com.bankapi.Santander.Dev.Week.domain.repository;

import com.bankapi.Santander.Dev.Week.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  boolean existsByAccountNumber(String accountNumber);
}
