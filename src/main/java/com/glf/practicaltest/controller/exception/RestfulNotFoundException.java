package com.glf.practicaltest.controller.exception;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

public class RESTfulNotFoundException extends RuntimeException {

    public RESTfulNotFoundException() {
    }

    public RESTfulNotFoundException(String message) {
        super(message);
    }
}
