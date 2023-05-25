package com.gleon.usersapi.services;

import com.gleon.usersapi.domain.UserRequest;
import com.gleon.usersapi.domain.entities.User;
import com.gleon.usersapi.exceptions.ApplicationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    User createUser(UserRequest userRequest) throws Exception;

    Page<User> getUsers(Pageable pageable);

    User getUserById(Long id) throws ApplicationException;

    void updateUser(Long id, UserRequest userRequest);

    void deleteUser(Long id);
}
