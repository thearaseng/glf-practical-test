package com.glf.practicaltest.service.impl;

import com.glf.practicaltest.model.Receipt;
import com.glf.practicaltest.repository.ReceiptRepository;
import com.glf.practicaltest.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@Service
public class ReceiptServiceImpl implements ReceiptService {

    private ReceiptRepository receiptRepository;

    @Autowired
    public ReceiptServiceImpl(ReceiptRepository receiptRepository) {
        this.receiptRepository = receiptRepository;
    }

    @Override
    public List<Receipt> findAll() {
        List<Receipt> receipts = new ArrayList<>();
        receiptRepository.findAll().forEach(receipts::add);

        return receipts;
    }

}
