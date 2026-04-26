# Java OOP Concepts – Banking System Implementation

A structured implementation of core **Object-Oriented Programming (OOP)** concepts in Java using a simple banking system model.
This project demonstrates how OOP principles are applied in a practical scenario rather than isolated examples.

---

## 📌 Concepts Covered

* **Abstraction** – Using abstract classes to define common behavior
* **Encapsulation** – Protecting data with private fields and getters/setters
* **Inheritance** – Reusing properties and methods through class hierarchy
* **Polymorphism**

    * Compile-time (Method Overloading)
    * Runtime (Method Overriding)
* **Interface** – Defining contracts for common operations
* **Static Keyword** – Shared class-level data and methods
* **Final Keyword** – Constants and method restrictions

---

## ⚙️ Features

* Savings Account and Current Account implementation
* Deposit and Withdraw functionality
* Interest calculation for savings accounts
* Overdraft handling for current accounts
* Account tracking using static variables

---

## 🧠 Design Overview

* `BankAccount` → Abstract base class
* `SavingsAccount`, `CurrentAccount` → Derived classes
* `Transaction` → Interface for deposit/withdraw operations
* Demonstrates real-world use of inheritance and polymorphism

---

## ▶️ How to Run

1. Clone the repository
2. Compile the Java file:

   ```bash
   javac BankSystemDemo.java
   ```
3. Run the program:

   ```bash
   java BankSystemDemo
   ```

---

## 🎯 Purpose

This project is intended as a **learning and revision resource** for understanding how OOP concepts are implemented in Java through a realistic example.

---

## 📁 Project Structure

```
Java-OOP-Banking-System/
│
├── BankSystemDemo.java
└── README.md
```

---

## 🚀 Future Improvements

* Add user input (menu-driven system)
* Store account data using file handling
* Split into multiple classes/files (modular design)
* Add basic UI or web interface

---

## 📌 Note

This is a simplified academic project intended to demonstrate OOP concepts clearly, not a production-ready banking system.
