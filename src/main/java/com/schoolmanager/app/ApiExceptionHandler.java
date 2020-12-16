package com.schoolmanager.app;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = { Exception.class })
    public String handleExeception(Throwable e) {

        return "wrong";
    }

}