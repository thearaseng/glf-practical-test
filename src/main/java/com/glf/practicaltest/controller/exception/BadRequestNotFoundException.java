package com.glf.practicaltest.controller.exception;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

public class BadRequestNotFoundException extends RuntimeException {

    public BadRequestNotFoundException() {
    }

    public BadRequestNotFoundException(String message) {
        super(message);
    }
}
