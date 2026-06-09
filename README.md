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

## Progress Update - 10 June 2026

### Completed Today

#### 1. Circuit Breaker Implementation
- Learned Resilience4j Circuit Breaker concepts.
- Implemented Circuit Breaker for service-to-service communication.
- Configured:
  - Sliding Window
  - Failure Rate Threshold
  - Half-Open State
  - Open State Timeout
- Tested fallback behavior when Inventory Service is unavailable.

#### 2. Retry Pattern
- Learned Retry Pattern concepts.
- Understood how Retry works with Circuit Breaker.
- Explored scenarios for service recovery.

#### 3. Rate Limiter
- Studied Rate Limiter pattern.
- Learned how to protect APIs from excessive requests.

#### 4. Eureka Service Discovery
- Fixed service registration issues.
- Verified Product Service, Inventory Service, and Order Service registration.

#### 5. Maven Dependency Cleanup
- Fixed incorrect Spring Boot dependencies.
- Corrected test dependencies.
- Resolved JPA and Maven build issues.

#### 6. Docker Setup
- Installed WSL2.
- Installed Docker Desktop.
- Verified Docker environment for future Kafka setup.

#### 7. Kafka Preparation
- Studied Kafka architecture:
  - Producer
  - Consumer
  - Broker
  - Topic
- Planned Product Service → Kafka → Inventory Service integration.

---


## Progress - June 9, 2026

### Completed
- Eureka Server setup
- API Gateway routing
- Product Service
- Inventory Service
- Order Service
- OpenFeign communication
- Automatic inventory creation on product creation
- JWT token generation
- Started JWT validation in API Gateway
- Started Circuit Breaker implementation using Resilience4j

### Next Steps
- Fix JWT validation
- Complete Circuit Breaker fallback
- Retry Pattern
- Kafka Integration
- Config Server
- ELK Stack
- Prometheus & Grafana



## Author

Hijore P
Java Full Stack Developer
