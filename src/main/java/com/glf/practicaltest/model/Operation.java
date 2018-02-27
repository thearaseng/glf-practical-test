package com.glf.practicaltest.model;

import javax.persistence.*;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@Entity
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String operationCode;
    private String description;

    @ManyToOne
    private Receipt receipt;
    private Double price;
    private Double defaultDlt;
    private Double defaultWage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDefaultDlt() {
        return defaultDlt;
    }

    public void setDefaultDlt(Double defaultDlt) {
        this.defaultDlt = defaultDlt;
    }

    public Double getDefaultWage() {
        return defaultWage;
    }

    public void setDefaultWage(Double defaultWage) {
        this.defaultWage = defaultWage;
    }
}
