package com.glf.practicaltest.model;

import javax.persistence.*;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

@Entity
public class OperationArea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Area area;
    @ManyToOne
    private Operation operation;
    private Long dlt;
    private Long wage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Long getDlt() {
        return dlt;
    }

    public void setDlt(Long dlt) {
        this.dlt = dlt;
    }

    public Long getWage() {
        return wage;
    }

    public void setWage(Long wage) {
        this.wage = wage;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
