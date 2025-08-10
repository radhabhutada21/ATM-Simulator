# ATM Banking System Simulator

## 📌 Project Overview
The **ATM Banking System Simulator** is a Java Swing-based desktop application that simulates real-world ATM functionalities.  
It allows users to register, log in, and perform core banking transactions such as deposits, withdrawals, balance enquiry, PIN change, and mini statements.  
The system uses **MySQL** as the backend database with **JDBC** for connectivity.

---

## 🚀 Features
- **Multi-step User Registration** (Signup1, Signup2, Signup3)
- **Secure Login** using Card Number and PIN
- **Deposit Money** with validation
- **Withdraw Money** (manual and fast cash options)
- **Balance Enquiry** for real-time account status
- **PIN Change** functionality
- **Mini Statement** for recent transactions
- **SQL Triggers** to enforce PIN rules and card number uniqueness
- **Database Normalization** for data integrity

---

## 🛠️ Tech Stack
**Frontend (GUI)**: Java Swing  
**Backend Logic**: Java (OOP, Event-driven programming)  
**Database**: MySQL (5 normalized tables)  
**DB Connector**: JDBC  

## ⚙️ Installation & Setup
1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/atm-banking-system.git
   cd atm-banking-system
Set up the database

Open MySQL

Run the SQL script from db.txt to create tables

Configure DB Connection

In Conn.java, update:


c = DriverManager.getConnection(
    "jdbc:mysql:///bankmanagementsystem", "root", "yourpassword"
);

Run the Application

Compile Java files:


javac *.java
Run the main class:


java Login
📊 Sample SQL Queries
View all transactions:


SELECT * FROM bank;
View all saving accounts:


SELECT * FROM signup3 WHERE accountType = 'Saving Account';
Category-wise user count:


SELECT category, COUNT(*) FROM signup2 GROUP BY category;
📜 License
This project is open-source and available under the MIT License.
