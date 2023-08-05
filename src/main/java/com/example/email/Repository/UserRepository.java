package com.example.email.Repository;

import com.example.email.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findAllByEmailIdIgnoreCase(String emailId);
}
