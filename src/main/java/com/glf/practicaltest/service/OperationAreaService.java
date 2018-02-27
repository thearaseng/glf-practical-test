package com.glf.practicaltest.service;

import com.glf.practicaltest.model.Area;
import com.glf.practicaltest.model.Operation;
import com.glf.practicaltest.model.OperationArea;
import com.glf.practicaltest.model.command.OperationAreaCommand;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

public interface OperationAreaService {

    OperationArea save(OperationAreaCommand operationAreaCommand);
    OperationArea findByOperationAndArea(Operation operation, Area area);

}
