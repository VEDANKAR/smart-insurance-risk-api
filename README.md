# Smart Insurance Risk Monitoring API

A Spring Boot RESTful backend service designed to process real-time IoT sensor data from vehicles, analyze risk using rule-based logic, and generate instant automated alerts. 

This repository contains the backend API module of a broader group project integrating Java, Spring Boot, and physical IoT hardware. It acts as the central data ingestion and processing layer, designed as a stateless microservice ready for cloud deployment.

##  Features
* Real-Time Data Ingestion: Exposes a REST API endpoint to receive continuous JSON payloads from remote IoT sensors.
* Rule-Based Risk Engine: Analyzes incoming telemetry (speed, heart rate) against predefined safety thresholds.
* Automated Alerting: Immediately returns actionable status codes (High Risk, Moderate Risk, Normal) based on the processed data.

##  Tech Stack
* Language:Java
* Framework:Spring Boot (Spring Web)
* Build Tool:Maven
* Architecture:Layered MVC (Model, Service, Controller)

##  Running the Application Locally
1. Clone the repository:
   ```bash
   git clone [https://github.com/VEDANKAR/smart-insurance-risk-api.git](https://github.com/VEDANKAR/smart-insurance-risk-api.git)
