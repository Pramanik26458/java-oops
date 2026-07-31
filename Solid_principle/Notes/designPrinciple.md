# SOLID Principles in Object-Oriented Programming (OOP)

> SOLID is a set of **five object-oriented design principles** that help developers write code that is **clean, maintainable, scalable, reusable, and easy to test**.

---

# What is SOLID?

**SOLID** stands for:

| Letter | Principle |
|---------|------------|
| S | Single Responsibility Principle |
| O | Open/Closed Principle |
| L | Liskov Substitution Principle |
| I | Interface Segregation Principle |
| D | Dependency Inversion Principle |

---

# 1. Single Responsibility Principle (SRP)

## Definition

> **A class should have only one reason to change.**

A class should perform **only one responsibility**. If a class handles multiple responsibilities, changing one feature may affect others.

---

## ❌ Bad Example

```java
class Report {

    public void generateReport() {
        System.out.println("Generating report...");
    }

    public void saveToDatabase() {
        System.out.println("Saving report...");
    }

    public void sendEmail() {
        System.out.println("Sending email...");
    }
}
```

### Problems

The `Report` class has **three responsibilities**:

- Generate report
- Save report
- Send email

If email logic changes, the `Report` class changes.

---

## ✅ Good Example

```java
class ReportGenerator {

    public void generate() {
        System.out.println("Generating report...");
    }
}
```

```java
class ReportSaver {

    public void save() {
        System.out.println("Saving report...");
    }
}
```

```java
class EmailService {

    public void send() {
        System.out.println("Sending email...");
    }
}
```

Each class has only **one responsibility**.

---

# 2. Open/Closed Principle (OCP)

## Definition

> **Software entities should be open for extension but closed for modification.**

You should be able to **add new functionality without changing existing code.**

---

## ❌ Bad Example

```java
class Payment {

    public void pay(String type) {

        if(type.equals("UPI")) {
            System.out.println("UPI Payment");
        }
        else if(type.equals("CARD")) {
            System.out.println("Card Payment");
        }
    }
}
```

### Problem

Every time a new payment method is added, you modify the existing class.

---

## ✅ Good Example

### Step 1

```java
interface PaymentMethod {
    void pay();
}
```

### Step 2

```java
class UpiPayment implements PaymentMethod {

    public void pay() {
        System.out.println("UPI Payment");
    }
}
```

```java
class CardPayment implements PaymentMethod {

    public void pay() {
        System.out.println("Card Payment");
    }
}
```

### Step 3

```java
class PaymentService {

    public void makePayment(PaymentMethod payment) {
        payment.pay();
    }
}
```

Now adding NetBanking doesn't require modifying existing classes.

---

# 3. Liskov Substitution Principle (LSP)

## Definition

> **Objects of a subclass should be replaceable with objects of the parent class without breaking the program.**

A child class should behave like its parent.

---

## ❌ Bad Example

```java
class Bird {

    public void fly() {
        System.out.println("Flying");
    }
}
```

```java
class Penguin extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }
}
```

### Problem

Penguins cannot fly.

Replacing `Bird` with `Penguin` breaks the program.

---

## ✅ Good Example

```java
class Bird {
}
```

```java
interface Flyable {
    void fly();
}
```

```java
class Sparrow extends Bird implements Flyable {

    public void fly() {
        System.out.println("Flying");
    }
}
```

```java
class Penguin extends Bird {

}
```

Now every class behaves correctly.

---

# 4. Interface Segregation Principle (ISP)

## Definition

> **Clients should not be forced to implement interfaces they don't use.**

Instead of one large interface, create multiple smaller interfaces.

---

## ❌ Bad Example

```java
interface Worker {

    void work();

    void eat();

    void sleep();
}
```

```java
class Robot implements Worker {

    public void work() {
        System.out.println("Working");
    }

    public void eat() {
    }

    public void sleep() {
    }
}
```

### Problem

Robot doesn't eat or sleep.

---

## ✅ Good Example

```java
interface Workable {
    void work();
}
```

```java
interface Eatable {
    void eat();
}
```

```java
interface Sleepable {
    void sleep();
}
```

```java
class Human implements Workable, Eatable, Sleepable {

    public void work() {
        System.out.println("Working");
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}
```

```java
class Robot implements Workable {

    public void work() {
        System.out.println("Working");
    }
}
```

Now every class implements only what it needs.

---

# 5. Dependency Inversion Principle (DIP)

## Definition

> **High-level modules should not depend on low-level modules. Both should depend on abstractions.**

Depend on interfaces rather than concrete classes.

---

## ❌ Bad Example

```java
class Keyboard {

    public void type() {
        System.out.println("Typing...");
    }
}
```

```java
class Computer {

    private Keyboard keyboard = new Keyboard();

    public void start() {
        keyboard.type();
    }
}
```

### Problem

`Computer` is tightly coupled to `Keyboard`.

---

## ✅ Good Example

```java
interface InputDevice {
    void input();
}
```

```java
class Keyboard implements InputDevice {

    public void input() {
        System.out.println("Typing...");
    }
}
```

```java
class Mouse implements InputDevice {

    public void input() {
        System.out.println("Clicking...");
    }
}
```

```java
class Computer {

    private InputDevice device;

    public Computer(InputDevice device) {
        this.device = device;
    }

    public void start() {
        device.input();
    }
}
```

Usage:

```java
Computer pc = new Computer(new Keyboard());

Computer pc2 = new Computer(new Mouse());
```

Now `Computer` depends on the **InputDevice interface**, not on specific devices.

---

# Easy Way to Remember SOLID

| Principle | Meaning |
|-----------|---------|
| **S** | One class → One responsibility |
| **O** | Extend code, don't modify existing code |
| **L** | Child class should properly replace parent class |
| **I** | Small, focused interfaces are better |
| **D** | Depend on interfaces, not concrete classes |

---

# Real-World Examples

| Principle | Example |
|-----------|---------|
| SRP | One employee handles one department |
| OCP | Add new payment methods without changing old code |
| LSP | Every car should be drivable like any other car |
| ISP | TV remote has only necessary buttons |
| DIP | Computer works with any USB keyboard because it depends on the USB standard |

---

# Interview Tips

### What is SOLID?

> SOLID is a collection of five object-oriented design principles introduced by Robert C. Martin (Uncle Bob). These principles help us write software that is maintainable, scalable, loosely coupled, easy to test, and easier to extend.

---

### Why use SOLID?

- Improves code readability
- Reduces code duplication
- Makes code easier to maintain
- Promotes loose coupling
- Simplifies testing
- Makes applications easier to extend
- Encourages reusable code

---

# Quick Revision

```
S → Single Responsibility Principle
One class = One responsibility

O → Open/Closed Principle
Open for extension, Closed for modification

L → Liskov Substitution Principle
Child should replace parent without breaking code

I → Interface Segregation Principle
Many small interfaces are better than one large interface

D → Dependency Inversion Principle
Depend on abstractions, not concrete implementations
```

---

# Conclusion

Following the SOLID principles leads to software that is:

- ✅ Easy to maintain
- ✅ Easy to extend
- ✅ Reusable
- ✅ Testable
- ✅ Flexible
- ✅ Less tightly coupled

These principles are widely used in enterprise applications, Spring Boot projects, and are commonly discussed in Java and OOP technical interviews.