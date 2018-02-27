package com.glf.practicaltest.model.converter;

import com.glf.practicaltest.model.OperationArea;
import com.glf.practicaltest.model.command.OperationAreaCommand;
import com.glf.practicaltest.service.AreaService;
import com.glf.practicaltest.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@Component
public class OperationAreaCommandToOperationArea implements Converter<OperationAreaCommand, OperationArea> {

    private ReceiptService receiptService;
    private AreaService areaService;

    @Autowired
    public OperationAreaCommandToOperationArea(ReceiptService receiptService, AreaService areaService) {
        this.receiptService = receiptService;
        this.areaService = areaService;
    }

    @Override
    public OperationArea convert(OperationAreaCommand operationAreaCommand) {

        if (operationAreaCommand == null)
            return null;

        final OperationArea operationArea = new OperationArea();
        operationArea.setId(operationAreaCommand.getId());
        operationArea.setArea(areaService.findById(operationAreaCommand.getAreaId()));
        operationArea.setDlt(operationAreaCommand.getDlt());
        operationArea.setWage(operationAreaCommand.getWage());

        return operationArea;

    }

}
