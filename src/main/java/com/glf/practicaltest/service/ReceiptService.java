package com.glf.practicaltest.service;

import com.glf.practicaltest.model.Receipt;

import java.util.List;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

public interface ReceiptService {

    List<Receipt> findAll();
    Receipt findById(Long id);

}
