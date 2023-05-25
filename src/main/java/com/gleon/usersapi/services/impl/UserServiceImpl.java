package com.gleon.usersapi.services.impl;

import com.gleon.usersapi.domain.UserRequest;
import com.gleon.usersapi.domain.entities.User;
import com.gleon.usersapi.exceptions.ApplicationException;
import com.gleon.usersapi.repositories.UserRepository;
import com.gleon.usersapi.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {


    private final UserRepository repository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public User createUser(UserRequest userRequest) throws Exception{
        User user = modelMapper.map(userRequest, User.class);
        user = repository.save(user);
        log.info("User created: " + user.getId());
        return user;
    }

    @Override
    public Page<User> getUsers(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public User getUserById(Long id) throws ApplicationException {
        Optional<User> byId = repository.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        }
        log.warn("User not found: " + id);
        throw new ApplicationException("User not found for ID: " + id);
    }

    @Override
    public void updateUser(Long id, UserRequest userRequest) {
        User user = modelMapper.map(userRequest, User.class);
        user.setId(id);
        log.info("User updated: " + id);
        repository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        log.info("User deleted: " + id);
        repository.deleteById(id);
    }
}
