# React-Spring-Boot

> Lightweight Spring Boot backend for a Product Catalog (H2 seeded)

<p align="center">
  <img alt="logo" src="https://raw.githubusercontent.com/github/explore/main/topics/spring-boot/spring-boot.png" width="120" />
</p>

## Overview
A simple, starter Spring Boot application exposing a REST API to manage products. Includes JPA entities, a repository, service layer and controller, plus a seeded H2 dataset for quick local testing.

## Highlights
- Spring Boot + Jakarta Persistence (JPA)
- H2 in-memory database with seed data (src/main/resources/data.sql)
- Clean layered structure: controller → service → repo → model
- Maven wrapper for reproducible builds

## Project structure

- pom.xml
- mvnw, mvnw.cmd, .mvn/
- src/
  - main/
    - java/com/H2_Connection/React_Spring/Boot/
      - ReactSpringBootApplication.java        # Spring Boot entrypoint
      - controller/
        - ProductController.java              # REST endpoints (/api)
      - service/
        - ProductService.java                 # Business logic
      - repo/
        - ProductRepo.java                    # JPA repository
      - model/
        - Product.java                        # JPA entity (id, name, description, brand, price, category, releaseDate, available, quantity)
    - resources/
      - application.properties                # App configuration
      - data.sql                              # Sample INSERTs to seed DB
- target/                                    # Build output

## API Endpoints
- GET /api/           → "Hello World"
- GET /api/products   → Returns all products as JSON

Example curl:

```bash
curl -s http://localhost:8080/api/products | jq .
```

## Product model (summary)
- id: int
- name: String
- description: String
- brand: String
- price: BigDecimal
- category: String
- releaseDate: Date
- available: Boolean
- quantity: int

## Run locally
Windows (Maven wrapper):

```powershell
.\mvnw spring-boot:run
```

Or with Maven installed:

```bash
mvn spring-boot:run
```

App will start on http://localhost:8080 by default.

## Quick development notes
- Data is seeded from src/main/resources/data.sql during startup.
- ProductService currently returns a placeholder list — wire it to ProductRepo (JPA) for real data retrieval.
- Use Postman or curl to exercise endpoints.

## Contributing
Contributions welcome. Open issues or PRs for improvements, features, or bug fixes.

## License
MIT — feel free to use and adapt.

---

Made with ❤️ — React frontend can be added separately and configured to consume /api endpoints.