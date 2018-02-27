package com.glf.practicaltest.service.impl;

import com.glf.practicaltest.model.Operation;
import com.glf.practicaltest.repository.OperationRepository;
import com.glf.practicaltest.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@Service
public class OperationServiceImpl implements OperationService {

    private OperationRepository operationRepository;

    @Autowired
    public OperationServiceImpl(OperationRepository operationRepository) {
        this.operationRepository = operationRepository;
    }

    @Override
    public List<Operation> findAll() {
        List<Operation> operations = new ArrayList<>();
        operationRepository.findAll().forEach(operations::add);

        return operations;
    }

    @Override
    public Operation findById(Long id) {
        Optional<Operation> operationOptional = operationRepository.findById(id);

        return operationOptional.orElse(null);

    }

}
