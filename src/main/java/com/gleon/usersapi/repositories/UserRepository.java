package com.gleon.usersapi.repositories;

import com.gleon.usersapi.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import javax.transaction.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}
