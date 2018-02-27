package com.glf.practicaltest.model.command;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

public class OperationAreaCommand {

    private Long id;
    private Long areaId;
    private Long dlt;
    private Long wage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
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
}
