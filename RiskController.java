package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SensorData;
import com.example.demo.service.RiskAnalysisService;

@RestController
@RequestMapping("/api/v1/risk")
public class RiskController {

    private final RiskAnalysisService riskAnalysisService;

    public RiskController(RiskAnalysisService riskAnalysisService) {
        this.riskAnalysisService = riskAnalysisService;
    }

    @PostMapping("/analyze")
    public String receiveSensorData(@RequestBody SensorData data) {
        return riskAnalysisService.analyzeRisk(data);
    }
}