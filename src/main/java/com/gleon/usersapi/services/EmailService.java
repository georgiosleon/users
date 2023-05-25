package com.gleon.usersapi.services;

import com.gleon.usersapi.domain.UserRequest;
import com.gleon.usersapi.domain.entities.User;
import com.gleon.usersapi.exceptions.ApplicationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmailService {
    void sendEmail(String email) throws Exception;


}
