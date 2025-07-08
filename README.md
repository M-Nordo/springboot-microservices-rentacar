# 🚗 Rent A Car API (Spring Boot)

A simple and clean microservice-style backend application that provides RESTful APIs for a car rental system.  
Spring Boot, PostgreSQL, JPA, and Docker are used to build a scalable and professional structure.

---

## About The Project

This project is a backend REST API for a car rental system, built using Spring Boot. It features layered architecture and connects to a PostgreSQL database via JPA. Docker support is included for database management.

### ✨ Features
- Full CRUD for car entities
- Layered architecture (Controller, Service, DTO, Entity, Repository)
- Swagger/OpenAPI documentation
- CORS configuration
- Docker-based PostgreSQL setup
- Basic test class included
- Clean code with Lombok

---

## 🚀 How to Run ?

### Prerequisites
- Java 17+
- Maven 3.8+
- Docker
- Database installed with PostgreSQL or Docker

### Steps

1. Initialize PostgreSQL database with Docker:
   ```bash
   docker-compose up -d
   ```
2. Start the application
   ```bash
   mvnd spring-boot:run
   ```
3. Accessing the Swagger interface
   ```bash
   http://localhost:8080/swagger-ui.html
   ```
---

## 🇹🇷 Proje Hakkında

Bu proje, araç kiralama sistemi için geliştirilmiş bir REST API mimarisi içerir. Spring Boot kullanılarak yazılmıştır. PostgreSQL, JPA, Maven ve Swagger teknolojileri ile desteklenmiştir.

### ✨ Özellikler
- Araç CRUD işlemleri (Oluştur, Listele, Güncelle, Sil)
- Katmanlı mimari (Controller, Service, DTO, Entity, Repository)
- Swagger/OpenAPI dökümantasyonu
- CORS yapılandırması
- Docker ile PostgreSQL veritabanı kurulumu
- Basit test sınıfı
- Clean Code + Lombok

---


## 🚀 Nasıl Çalıştırılır? | How to Run

### Gerekli Araçlar / Prerequisites
- Java 17+
- Maven 3.8+
- Docker
- PostgreSQL veya Docker ile kurulu veritabanı

### Adımlar

1. PostgreSQL veritabanını Docker ile başlat:
   ```bash
   docker-compose up -d
   ```
2. Uygulamayı başlat
   ```bash
   mvnd spring-boot:run
   ```
3. Swagger arayüzüne eriş
   ```bash
   http://localhost:8080/swagger-ui.html
   ```
