package com.glf.practicaltest.controller.rest;

import com.glf.practicaltest.controller.exception.RestfulNotFoundException;
import com.glf.practicaltest.controller.rest.response.ResponseList;
import com.glf.practicaltest.controller.rest.response.ResponseRecord;
import com.glf.practicaltest.model.Operation;
import com.glf.practicaltest.model.command.OperationCommand;
import com.glf.practicaltest.model.converter.OperationCommandToOperation;
import com.glf.practicaltest.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@RestController
@RequestMapping("/api/operations")
public class OperationController {

    private OperationService operationService;
    private OperationCommandToOperation operationCommandToOperation;

    @Autowired
    public OperationController(OperationService operationService, OperationCommandToOperation operationCommandToOperation) {
        this.operationService = operationService;
        this.operationCommandToOperation = operationCommandToOperation;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<ResponseRecord<Operation>> save(@RequestBody OperationCommand operationCommand) {

        operationCommand.setId(null);
        Operation operation = operationService.save(operationCommandToOperation.convert(operationCommand));

        return new ResponseEntity<>(new ResponseRecord<>(HttpStatus.CREATED.toString(), "success", operation), HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<ResponseList<Operation>> findAll() {
        return new ResponseEntity<>(new ResponseList<>(HttpStatus.OK.toString(), "success", operationService.findAll()), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<ResponseRecord<Operation>> findById(@PathVariable Long id) {

        Operation operation = operationService.findById(id);

        if (operation == null)
            throw new RestfulNotFoundException();

        return new ResponseEntity<>(new ResponseRecord<>(HttpStatus.OK.toString(), "success", operation), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<ResponseRecord<Operation>> update(@PathVariable Long id, @RequestBody OperationCommand operationCommand) {

        operationCommand.setId(id);
        Operation operation = operationCommandToOperation.convert(operationCommand);
        operation = operationService.save(operation);

        return new ResponseEntity<>(new ResponseRecord<>(HttpStatus.OK.toString(), "success", operation), HttpStatus.OK);

    }

}
