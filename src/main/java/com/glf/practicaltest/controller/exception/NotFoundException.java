package com.glf.practicaltest.controller.exception;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }
}
