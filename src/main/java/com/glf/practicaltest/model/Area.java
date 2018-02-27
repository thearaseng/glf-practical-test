package com.glf.practicaltest.model;

import javax.persistence.*;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@Entity
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "area", fetch = FetchType.LAZY)
    private OperationArea operationArea;
    private String areaName;
    private String zipCode;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OperationArea getOperationArea() {
        return operationArea;
    }

    public void setOperationArea(OperationArea operationArea) {
        this.operationArea = operationArea;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
