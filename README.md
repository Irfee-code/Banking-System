# 🏦 Banking System (Core Java - OOP Design)

## 📌 Overview

This is a console-based Banking System built using Core Java.
The project demonstrates strong Object-Oriented Programming principles and layered architecture design.

The system supports:

- Customer creation
- Multiple accounts per customer
- Deposit
- Withdraw
- Fund transfer between accounts
- Transaction history tracking

---

## 🧠 Concepts Used

- Encapsulation
- Abstraction
- Inheritance
- Polymorphism
- Layered Architecture
- Separation of Concerns
- Collections Framework (List)
- Java Time API (LocalDateTime)

---


---

## 🧱 Modules Description

### 1️⃣ Account (Abstract Class)
Base class for all account types.

Handles:
- Deposit
- Balance management
- Transaction recording
- Amount validation

Defines abstract methods:
- withdraw()
- calculateInterest()

---

### 2️⃣ SavingsAccount
- Cannot withdraw more than available balance
- Has interest calculation

---

### 3️⃣ CurrentAccount
- Can support overdraft (if implemented)
- Custom withdrawal logic

---

### 4️⃣ Transaction
Records:
- Transaction type (DEPOSIT / WITHDRAW)
- Amount
- Timestamp

---

### 5️⃣ Customer
Represents a bank customer.

Stores:
- Customer details
- Multiple accounts

---

### 6️⃣ Bank
Manages:
- Customers
- Account lookup across customers

---

### 7️⃣ BankService
Business logic layer.

Handles:
- Customer creation
- Opening accounts
- Deposit
- Withdraw
- Transfer between accounts

---

## 🔄 Sample Flow

1. Create Bank
2. Create Customer
3. Open Savings Account
4. Deposit money
5. Withdraw money
6. Transfer funds
7. View transaction history

---

## 🎯 Key Design Decisions

- Financial logic kept inside `Account`
- Workflow logic handled by `BankService`
- Data ownership hierarchy:



- Transactions are immutable once recorded.
- `Collections.unmodifiableList()` used to protect transaction history.

---

## 🚀 Future Improvements

- Convert to Spring Boot REST API
- Add Database integration (JPA / Hibernate)
- Add authentication
- Add transaction fees
- Add custom exceptions
- Add logging & validation layer
- Add CLI or GUI interface

---

## 🏁 Status

Core banking backend logic complete.
Version: v1.0 (In-Memory Implementation)

---

## 👨‍💻 Author

Built as a backend architecture learning project.