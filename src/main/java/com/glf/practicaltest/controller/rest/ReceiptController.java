package com.glf.practicaltest.controller.rest;

import com.glf.practicaltest.controller.rest.response.ResponseList;
import com.glf.practicaltest.model.Receipt;
import com.glf.practicaltest.service.ReceiptService;
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
@RequestMapping("/api/receipts")
public class ReceiptController {

    private ReceiptService receiptService;

    @Autowired
    public ReceiptController(ReceiptService receiptService) {
        this.receiptService = receiptService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<ResponseList<Receipt>> findAll() {
        return new ResponseEntity<>(new ResponseList<>(HttpStatus.OK.toString(), "success", receiptService.findAll()), HttpStatus.OK);
    }

}
