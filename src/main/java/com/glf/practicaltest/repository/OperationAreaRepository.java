package com.glf.practicaltest.repository;

import com.glf.practicaltest.model.Area;
import com.glf.practicaltest.model.Operation;
import com.glf.practicaltest.model.OperationArea;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

public interface OperationAreaRepository extends CrudRepository<OperationArea, Long> {

    Optional<OperationArea> findByOperationAndArea(Operation operation, Area area);

}
