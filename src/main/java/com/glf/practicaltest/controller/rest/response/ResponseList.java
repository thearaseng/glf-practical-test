package com.glf.practicaltest.controller.rest.response;

import java.util.List;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

public class ResponseList<T> extends AbstractResponse {

    private List<T> data;

    public ResponseList(String code, String msg, List<T> data) {
        super(code, msg);
        this.data = data;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
