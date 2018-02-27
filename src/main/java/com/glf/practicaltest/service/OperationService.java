package com.glf.practicaltest.service;

import com.glf.practicaltest.model.Operation;

import java.util.List;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

public interface OperationService {

    List<Operation> findAll();
    Operation findById(Long id);

}
