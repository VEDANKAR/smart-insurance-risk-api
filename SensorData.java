package com.example.demo.model;

public class SensorData {
    private String vehicleId;
    private double speed;
    private int driverHeartRate;

    public SensorData() {}

    public SensorData(String vehicleId, double speed, int driverHeartRate) {
        this.vehicleId = vehicleId;
        this.speed = speed;
        this.driverHeartRate = driverHeartRate;
    }

    public String getVehicleId() { return vehicleId; }
    public void setVehicleId(String vehicleId) { this.vehicleId = vehicleId; }
    public double getSpeed() { return speed; }
    public void setSpeed(double speed) { this.speed = speed; }
    public int getDriverHeartRate() { return driverHeartRate; }
    public void setDriverHeartRate(int driverHeartRate) { this.driverHeartRate = driverHeartRate; }
}