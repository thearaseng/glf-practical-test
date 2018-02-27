package com.glf.practicaltest.controller.rest;

import com.glf.practicaltest.controller.rest.response.ResponseRecord;
import com.glf.practicaltest.model.OperationArea;
import com.glf.practicaltest.model.command.OperationAreaCommand;
import com.glf.practicaltest.service.OperationAreaService;
import com.glf.practicaltest.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@RestController
@RequestMapping("/api/operation-areas")
public class OperationAreaController {

    private OperationAreaService operationService;

    @Autowired
    public OperationAreaController(OperationAreaService operationService) {
        this.operationService = operationService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<ResponseRecord<OperationArea>> save(@RequestBody OperationAreaCommand operationAreaCommand) {

        operationAreaCommand.setId(null);
        OperationArea operationArea = operationService.save(operationAreaCommand);

        return new ResponseEntity<>(new ResponseRecord<>(HttpStatus.CREATED.toString(), "success", operationArea), HttpStatus.CREATED);
    }

}
