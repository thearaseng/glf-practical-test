package com.glf.practicaltest.service.impl;

import com.glf.practicaltest.model.Area;
import com.glf.practicaltest.model.Receipt;
import com.glf.practicaltest.repository.AreaRepository;
import com.glf.practicaltest.repository.ReceiptRepository;
import com.glf.practicaltest.service.AreaService;
import com.glf.practicaltest.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@Service
public class AreaServiceImpl implements AreaService {

    private AreaRepository areaRepository;

    @Autowired
    public AreaServiceImpl(AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

    @Override
    public List<Area> findAll() {
        List<Area> areas = new ArrayList<>();
        areaRepository.findAll().forEach(areas::add);
        return areas;
    }

    @Override
    public Area findById(Long id) {
        Optional<Area> areaOptional = areaRepository.findById(id);

        return areaOptional.orElse(null);
    }
}
