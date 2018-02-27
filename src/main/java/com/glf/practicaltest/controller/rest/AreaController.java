package com.glf.practicaltest.controller.rest;

import com.glf.practicaltest.controller.rest.response.ResponseList;
import com.glf.practicaltest.model.Area;
import com.glf.practicaltest.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@RestController
@RequestMapping("/api/areas")
public class AreaController {

    private AreaService areaService;

    @Autowired
    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<ResponseList<Area>> findAll() {
        return new ResponseEntity<>(new ResponseList<>(HttpStatus.OK.toString(), "success", areaService.findAll()), HttpStatus.OK);
    }

}
