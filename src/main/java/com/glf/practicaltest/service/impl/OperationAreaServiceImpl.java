package com.glf.practicaltest.service.impl;

import com.glf.practicaltest.model.Area;
import com.glf.practicaltest.model.Operation;
import com.glf.practicaltest.model.OperationArea;
import com.glf.practicaltest.model.command.OperationAreaCommand;
import com.glf.practicaltest.model.converter.OperationAreaCommandToOperationArea;
import com.glf.practicaltest.repository.OperationAreaRepository;
import com.glf.practicaltest.service.OperationAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@Service
public class OperationAreaServiceImpl implements OperationAreaService {

    private OperationAreaRepository operationAreaRepository;
    private OperationAreaCommandToOperationArea operationAreaCommandToOperationArea;

    @Autowired
    public OperationAreaServiceImpl(OperationAreaRepository operationAreaRepository, OperationAreaCommandToOperationArea operationAreaCommandToOperationArea) {
        this.operationAreaRepository = operationAreaRepository;
        this.operationAreaCommandToOperationArea = operationAreaCommandToOperationArea;
    }

    @Override
    public OperationArea save(OperationAreaCommand operationAreaCommand) {
        return operationAreaRepository.save(operationAreaCommandToOperationArea.convert(operationAreaCommand));
    }

    @Override
    public OperationArea findByOperationAndArea(Operation operation, Area area) {
        return operationAreaRepository.findByOperationAndArea(operation, area).orElse(null);
    }

}
