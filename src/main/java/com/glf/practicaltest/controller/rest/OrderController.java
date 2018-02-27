package com.glf.practicaltest.controller.rest;

import com.glf.practicaltest.controller.rest.response.ResponseRecord;
import com.glf.practicaltest.model.Order;
import com.glf.practicaltest.model.command.OrderCommand;
import com.glf.practicaltest.service.OrderService;
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
@RequestMapping("/api/orders")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<ResponseRecord<Order>> save(@RequestBody OrderCommand orderCommand) {

        orderCommand.setId(null);
        Order order = orderService.save(orderCommand);

        return new ResponseEntity<>(new ResponseRecord<>(HttpStatus.CREATED.toString(), "success", order), HttpStatus.CREATED);
    }

}
