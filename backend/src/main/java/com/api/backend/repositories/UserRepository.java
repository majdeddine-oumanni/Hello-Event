package com.api.backend.repositories;

import com.api.backend.model.Role;
import com.api.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    List<User> findByRole(Role role);
    User findUserById(Long id);
}
