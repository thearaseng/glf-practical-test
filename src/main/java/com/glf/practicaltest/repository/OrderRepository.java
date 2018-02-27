package com.glf.practicaltest.repository;

import com.glf.practicaltest.model.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

public interface OrderRepository extends CrudRepository<Order, Long> {

}
