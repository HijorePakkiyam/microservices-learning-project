# Microservices Learning Project

## Overview

This project is being developed to learn and implement Microservices Architecture using Spring Boot and Spring Cloud.

## Services Implemented

### 1. Eureka Server

* Service Registry and Discovery
* All microservices register with Eureka
* Running on Port: 8761

### 2. API Gateway

* Implemented using Spring Cloud Gateway
* Routes requests to downstream services
* Running on Port: 8080

### 3. Product Service

* CRUD operations for products
* Connected to MySQL database
* Registered with Eureka
* Running on Port: 8081

### 4. Inventory Service

* Inventory management module
* Connected to MySQL database
* Registered with Eureka
* Running on Port: 8082

### 5. Order Service

* Initial project setup completed
* Registered with Eureka
* Future integration with Inventory Service using OpenFeign
* Running on Port: 8083

## Technologies Used

* Java 17
* Spring Boot 3.5.x
* Spring Cloud
* Eureka Server
* Spring Cloud Gateway
* Spring Data JPA
* MySQL
* Lombok
* Maven

## Current Architecture

Client
→ API Gateway
→ Eureka Service Discovery
→ Product Service
→ Inventory Service
→ Order Service

## Completed Today

* Configured Eureka Server
* Configured API Gateway
* Registered Product Service with Eureka
* Registered Inventory Service with Eureka
* Registered Order Service with Eureka
* Configured MySQL databases
* Verified service registration in Eureka Dashboard
* Verified API Gateway routing

## Next Steps

* Implement OpenFeign Communication
* Order Service → Inventory Service Integration
* DTO Layer Implementation
* Global Exception Handling
* Validation using @Valid
* Resilience4j (Circuit Breaker, Retry)
* Kafka Integration
* JWT Authentication
* Monitoring using Prometheus and Grafana

## How to Run

1. Start Eureka Server
2. Start API Gateway
3. Start Product Service
4. Start Inventory Service
5. Start Order Service
6. Open Eureka Dashboard:
   http://localhost:8761

## Author

Hijore P
Java Full Stack Developer
