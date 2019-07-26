package com.example.demo.domain.Repository;

import com.example.demo.domain.DAO.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDAO,Long> {
    UserDAO findByUserName(String userName);
    UserDAO findByUserNameOrEmail(String username, String email);
}
