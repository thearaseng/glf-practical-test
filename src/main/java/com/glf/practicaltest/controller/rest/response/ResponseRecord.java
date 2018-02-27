package com.glf.practicaltest.controller.rest.response;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

public class ResponseRecord<T> extends Response {

    private T data;

    public ResponseRecord(String code, String msg, T data) {
        super(code, msg);
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
