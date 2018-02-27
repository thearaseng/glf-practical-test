package com.glf.practicaltest.service.impl;

import com.glf.practicaltest.model.Order;
import com.glf.practicaltest.model.command.OrderCommand;
import com.glf.practicaltest.model.converter.OrderCommandToOrder;
import com.glf.practicaltest.repository.OrderRepository;
import com.glf.practicaltest.service.OperationService;
import com.glf.practicaltest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@Service
public class OrderServiceImpl implements OrderService{

    private OrderRepository orderRepository;
    private OperationService operationService;
    private OrderCommandToOrder orderCommandToOrder;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, OperationService operationService, OrderCommandToOrder orderCommandToOrder) {
        this.orderRepository = orderRepository;
        this.operationService = operationService;
        this.orderCommandToOrder = orderCommandToOrder;
    }

    @Override
    public Order save(OrderCommand orderCommand) {

        boolean isAmountOver2000 = orderCommand.getAmount() > 2_000D;

        if (isAmountOver2000) {
            orderCommand.setAmount(orderCommand.getAmount() * 0.95);
        }

        if (orderCommand.getOperationId() != 1 || isAmountOver2000)
            orderCommand.setTotalAmount(orderCommand.getTotalAmount() + operationService.findById(orderCommand.getOperationId()).getPrice());

        return orderRepository.save(orderCommandToOrder.convert(orderCommand));
    }

}
