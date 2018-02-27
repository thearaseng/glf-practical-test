package com.glf.practicaltest.controller;

import com.glf.practicaltest.controller.rest.response.Response;
import javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import com.glf.practicaltest.controller.exception.RestfulNotFoundException;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@ControllerAdvice
public class ControllerExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ModelAndView handleNotFoundException(Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/error/404");

        return modelAndView;
    }

    @ExceptionHandler(RestfulNotFoundException.class)
    @ResponseBody
    public ResponseEntity<Response> handleRestNotFoundException(RestfulNotFoundException e) {
        return new ResponseEntity<>(new Response("404", "resource not found"), HttpStatus.NOT_FOUND);
    }

}
