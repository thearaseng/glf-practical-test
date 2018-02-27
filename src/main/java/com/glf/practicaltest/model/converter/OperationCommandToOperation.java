package com.glf.practicaltest.model.converter;

import com.glf.practicaltest.model.Operation;
import com.glf.practicaltest.model.command.OperationCommand;
import com.glf.practicaltest.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@Component
public class OperationCommandToOperation implements Converter<OperationCommand, Operation> {

    private ReceiptService receiptService;

    @Autowired
    public OperationCommandToOperation(ReceiptService receiptService) {
        this.receiptService = receiptService;
    }

    @Override
    public Operation convert(OperationCommand operationCommand) {

        if (operationCommand == null)
            return null;

        final Operation operation = new Operation();
        operation.setId(operationCommand.getId());
        operation.setOperationCode(operationCommand.getOperationCode());
        operation.setDescription(operationCommand.getDescription());
        operation.setReceipt(receiptService.findById(operationCommand.getReceiptId()));
        operation.setPrice(operationCommand.getPrice());
        operation.setDefaultDlt(operationCommand.getDefaultDlt());
        operation.setDefaultWage(operationCommand.getDefaultWage());

        return operation;

    }

}
