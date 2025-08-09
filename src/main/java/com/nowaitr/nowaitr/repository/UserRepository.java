package com.nowaitr.nowaitr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nowaitr.nowaitr.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
