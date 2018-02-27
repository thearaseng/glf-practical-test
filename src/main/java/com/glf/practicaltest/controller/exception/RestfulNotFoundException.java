package com.glf.practicaltest.controller.exception;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

public class RestfulNotFoundException extends RuntimeException {

    public RestfulNotFoundException() {
    }

    public RestfulNotFoundException(String message) {
        super(message);
    }
}
