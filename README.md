# React-Spring-Boot

A Spring Boot backend for a Product catalog. Provides a simple REST API to manage products and includes a seeded H2 dataset.

Project structure

- pom.xml
- mvnw, mvnw.cmd, .mvn/
- src/
  - main/
    - java/com/H2_Connection/React_Spring/Boot/
      - ReactSpringBootApplication.java  (Spring Boot entrypoint)
      - controller/
        - ProductController.java  (REST endpoints)
      - service/
        - ProductService.java     (business logic)
      - repo/
        - ProductRepo.java        (JPA repository)
      - model/
        - Product.java            (JPA entity: id, name, description, brand, price, category, releaseDate, available, quantity)
    - resources/
      - application.properties   (app configuration)
      - data.sql                 (sample INSERTs to seed DB)
- target/ (build output)

Key endpoints

- GET /api/           -> "Hello World"
- GET /api/products   -> returns a list of Product JSON

Model (Product) fields

- id (int)
- name (String)
- description (String)
- brand (String)
- price (BigDecimal)
- category (String)
- releaseDate (Date)
- available (Boolean)
- quantity (int)

Run the app

- Using Maven wrapper (Windows):
  .\mvnw spring-boot:run

- Or with installed Maven:
  mvn spring-boot:run

Notes

- Data is seeded from src/main/resources/data.sql during startup (H2). Replace ProductService.getAllProducts() implementation with repository calls if not already done.
- If a React frontend is used, host it separately and point its API calls to this backend's /api endpoints.
