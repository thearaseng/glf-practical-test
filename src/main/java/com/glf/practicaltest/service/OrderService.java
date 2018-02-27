package com.glf.practicaltest.service;

import com.glf.practicaltest.model.Area;
import com.glf.practicaltest.model.Order;
import com.glf.practicaltest.model.command.OrderCommand;

import java.util.List;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

public interface OrderService {

    Order save(OrderCommand orderCommand);

}
