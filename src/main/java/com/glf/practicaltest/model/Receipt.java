package com.glf.practicaltest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@Entity
public class Receipt {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String receiptCode;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReceiptCode() {
        return receiptCode;
    }

    public void setReceiptCode(String receiptCode) {
        this.receiptCode = receiptCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
