package com.example.solarcontrollerproject;

public class ReadingsStructure {
//    private String longitude;
//    private String latitude;
//    private String elevation;
//    private String azimuth;

    private String timezone;
    private String currentHarvest;
    private String averageHarvest;  //30 minute average
    private String totalHarvest;  //30 minute harvest
    private String timestamp;

    public ReadingsStructure(String timezone, String currentHarvest, String averageHarvest, String totalHarvest, String timestamp) {
        this.timezone = timezone;
        this.currentHarvest = currentHarvest;
        this.averageHarvest = averageHarvest;
        this.totalHarvest = totalHarvest;
        this.timestamp = timestamp;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getCurrentHarvest() {
        return currentHarvest;
    }

    public void setCurrentHarvest(String currentHarvest) {
        this.currentHarvest = currentHarvest;
    }

    public String getAverageHarvest() {
        return averageHarvest;
    }

    public void setAverageHarvest(String averageHarvest) {
        this.averageHarvest = averageHarvest;
    }

    public String getTotalHarvest() {
        return totalHarvest;
    }

    public void setTotalHarvest(String totalHarvest) {
        this.totalHarvest = totalHarvest;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
