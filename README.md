# Object_Oriented_ATM

This project is a simple ATM application developed using Object-Oriented Programming (OOP) principles. It simulates basic ATM functionalities such as user login, balance inquiry, money deposit, and withdrawal.

---

## Features
- **User Authentication**: Validates user credentials (name and password) during login.
- **Balance Inquiry**: Displays the current account balance.
- **Money Deposit**: Allows the user to deposit a specified amount into their account.
- **Money Withdrawal**: Enables the user to withdraw a specified amount, ensuring sufficient funds are available.
- **Exit Option**: Allows the user to safely exit the application.

---

## Code Overview

### 1. `BankAccount` Class
- **Attributes**:
    - `accountHolder`: The name of the account holder.
    - `accountPassword`: The password for account authentication.
    - `balance`: The current balance of the account.
- **Methods**:
    - `login(String name, String password)`: Validates user credentials.
    - `displayBalance()`: Displays the current balance.
    - `deposit(double amount)`: Adds a specified amount to the balance.
    - `withdraw(double amount)`: Subtracts a specified amount if funds are sufficient.

### 2. `ATM` Class
- Contains the `main` method, which:
    - Simulates the ATM interface.
    - Handles user input for login, menu navigation, and transaction operations.
    - Ensures secure and logical flow of ATM functionalities.

---

## How to Run

1. Clone the repository or download the project files.
2. Open the project in an IDE such as **IntelliJ IDEA** or **Eclipse**.
3. Compile and run the `ATM.java` file.
4. Use the following sample credentials to test the application:
    - **Username**: Alice
    - **Password**: password123

---

## Sample Output

```plaintext
Welcome to the ATM!
Enter your name: Alice
Enter your password: password123
Login successful!

ATM Menu:
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Choose an option: 1
Your current balance is: $5000.0

ATM Menu:
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Choose an option: 2
Enter deposit amount: 1000
Successfully deposited $1000.0. New balance: $6000.0

ATM Menu:
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Choose an option: 4
Thank you for using the ATM. Goodbye!
