package com.gleon.usersapi.exceptions;

import com.gleon.usersapi.domain.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ApplicationExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<ErrorResponse> handleExceptions(Exception exception) {
        log.error("Something went wrong!", exception);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ErrorResponse("Bad Request", exception));
    }
}
