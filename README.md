# Java Test Writing Playground 🧪

A repository for my Java practice exercises and mini-projects—focused on learning and demonstrating testing skills with JUnit 5, along with other Java essentials.

---

## 🚀 What’s Inside

This repo is organized by topic—each folder contains isolated code you can explore and learn from:

```

junit5-basic/
junit5-parameterized/
junit5-custom-extensions/
mockito-stubbing/
mockito-integration/
...

````

- **junit5-basic** – Getting started with simple assertions and test lifecycle.
- **junit5-parameterized** – Using parameterized tests to cover more use-cases.
- **junit5-custom-extensions** – Creating your own JUnit 5 extensions for shared logic.
- **mockito-stubbing** – Basic Mockito usage: stubs, spies, mocks.
- **mockito-integration** – Integrating Mockito in more complex scenarios.

---

## ⚙️ How to Run

Each subproject is a standalone Maven module. From the repository root run:

```bash
mvn clean test
````

Or, if you're using Gradle:

```bash
./gradlew test
```

You can also enter any subfolder individually and run its build:

```bash
cd junit5-parameterized
mvn test
```

---

## 🧪 Why This Repo?

* 📚 **Learning playground**: Try out new testing techniques, experiment with configurations, and get hands-on quickly.
* 🧩 **Modular & focused**: Each folder is self-contained: its build file, code, and tests make it easy to browse and understand.
* 🏅 **Portfolio-ready**: When I build something more substantial, I’ll extract it into its own repo—this stays clean and experimental.

---

## 🎯 Goals & Next Steps

* Add more testing topics: Testcontainers, TestNG, coverage tools.
* Introduce CI with badges for **build** and **coverage**.
* Move larger, polished demos out into dedicated repos (e.g., a full Spring Boot sample).

---

## 📋 Table of Contents

* `junit5-basic/` – basic JUnit assertions & lifecycle
* `junit5-parameterized/` – parameterized tests
* `junit5-custom-extensions/` – custom test extensions
* `mockito-stubbing/` – mocks, spies, stubs usage
* `mockito-integration/` – integration scenarios with Mockito

(Check each folder’s own `README.md` for details!)

---

## 📌 Tags & Topics

```
Topics: java, junit5, mockito, unit-testing, tdd, java-playground
```

---

## 🛡️ License

[MIT License](LICENSE.md)

