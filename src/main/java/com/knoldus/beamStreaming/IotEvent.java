package com.knoldus.beamStreaming;

import java.io.Serializable;

public class IotEvent implements Serializable {

    private String deviceId;
    private String name;
    private String description;
    private Long eventTime;
    private Double temperature;
    private String unit;

    public IotEvent() {
    }

    /**
     *
     * @param deviceId unique & different device Id.
     * @param name  having different Event's name.
     * @param description event's specific description.
     * @param eventTime having different event time.
     * @param temperature indicates temperature of that's event.
     * @param unit number of events occurred at a time.
     */
    public IotEvent(String deviceId, String name, String description, Long eventTime, Double temperature, String unit) {
        this.deviceId = deviceId;
        this.name = name;
        this.description = description;
        this.eventTime = eventTime;
        this.temperature = temperature;
        this.unit = unit;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}

