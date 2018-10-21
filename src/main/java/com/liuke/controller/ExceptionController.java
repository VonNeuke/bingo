package com.liuke.controller;

import com.liuke.domain.ReturnModel;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionController {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Object errorHandler(Exception e) {
        return ReturnModel.getInstance(0, "error");
    }
}
