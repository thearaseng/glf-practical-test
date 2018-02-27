package com.glf.practicaltest.repository;

import com.glf.practicaltest.model.Operation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@Repository
public interface OperationRepository extends CrudRepository<Operation, Long> {

}
