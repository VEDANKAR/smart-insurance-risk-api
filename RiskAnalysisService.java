package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.SensorData;

@Service
public class RiskAnalysisService {

    public String analyzeRisk(SensorData data) {
        if (data.getSpeed() > 120 || data.getDriverHeartRate() > 100 || data.getDriverHeartRate() < 50) {
            return "HIGH RISK ANOMALY DETECTED: Alerting dispatch and logging insurance event for Vehicle " + data.getVehicleId();
        } else if (data.getSpeed() > 80) {
            return "MODERATE RISK: Speed warning issued for Vehicle " + data.getVehicleId();
        } else {
            return "NORMAL: Operations optimal.";
        }
    }
}