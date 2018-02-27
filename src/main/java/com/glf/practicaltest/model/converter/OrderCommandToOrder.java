package com.glf.practicaltest.model.converter;

import com.glf.practicaltest.model.Order;
import com.glf.practicaltest.model.command.OrderCommand;
import com.glf.practicaltest.service.AreaService;
import com.glf.practicaltest.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@Component
public class OrderCommandToOrder implements Converter<OrderCommand, Order> {

    private OperationService operationService;
    private AreaService areaService;

    @Autowired
    public OrderCommandToOrder(OperationService operationService, AreaService areaService) {
        this.operationService = operationService;
        this.areaService = areaService;
    }

    @Override
    public Order convert(OrderCommand orderCommand) {
        if (orderCommand == null)
            return null;

        final Order order = new Order();
        order.setId(orderCommand.getId());
        order.setAmount(orderCommand.getAmount());
        order.setDescription(orderCommand.getDescription());
        order.setTotalAmount(orderCommand.getTotalAmount());
        order.setArea(areaService.findById(orderCommand.getAreaId()));
        order.setOperation(operationService.findById(orderCommand.getOperationId()));

        return order;
    }
}
