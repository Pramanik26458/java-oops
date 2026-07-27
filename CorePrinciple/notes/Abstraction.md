# 🎭 Abstraction in Java

## 📖 What is Abstraction?

Abstraction is one of the four pillars of Object-Oriented Programming (OOP).

It is the process of **hiding implementation details** and showing **only the essential functionality** to the user.

In simple words, the user knows **what an object does**, but not **how it does it**.

> **Abstraction = Hiding Implementation + Showing Essential Features**

---

## 🎯 Why Do We Need Abstraction?

- Hides complex implementation details.
- Improves security by exposing only necessary features.
- Makes code easier to maintain.
- Reduces code complexity.
- Increases code reusability.

---

## ⚙️ How Abstraction Works

Java provides two ways to achieve abstraction:

### 1. Abstract Class

- Declared using the `abstract` keyword.
- Can contain both abstract and non-abstract methods.
- Cannot be instantiated (object cannot be created).

---

### 2. Interface

- Declared using the `interface` keyword.
- Contains abstract methods by default.
- A class uses the `implements` keyword to implement an interface.
- Supports multiple inheritance.

---

## 🌍 Real-Life Example

Think of a **Car**.

When you drive a car, you use the:

- Steering
- Brake
- Accelerator

You don't need to know how the engine, gearbox, or fuel injection system works internally.

You simply use the features.

This is **Abstraction**.

---

## 💻 Simple Example

```java
abstract class Animal {

    abstract void sound();
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## ✅ Advantages

- Hides unnecessary implementation details.
- Improves code security.
- Reduces complexity.
- Makes applications easier to maintain.
- Promotes code reusability.
- Focuses on essential functionality.

---

## ❌ Disadvantages

- Increases the number of classes and interfaces.
- Can make the design slightly more complex.
- Requires proper planning before implementation.

---

## 📝 Interview Questions

### 1. What is Abstraction?

Abstraction is the process of hiding implementation details and exposing only the essential features of an object.

---

### 2. How can Abstraction be achieved in Java?

Java achieves abstraction using:

- Abstract Classes
- Interfaces

---

### 3. What is an Abstract Class?

An Abstract Class is a class declared using the `abstract` keyword. It cannot be instantiated and may contain both abstract and non-abstract methods.

---

### 4. What is an Abstract Method?

An Abstract Method is a method declared without a body. It must be implemented by the child class.

Example:

```java
abstract void sound();
```

---

### 5. Can we create an object of an Abstract Class?

No.

An Abstract Class cannot be instantiated.

---

### 6. What is the difference between an Abstract Class and an Interface?

| Abstract Class | Interface |
|----------------|-----------|
| Uses `abstract` keyword | Uses `interface` keyword |
| Can have abstract and concrete methods | Methods are abstract by default |
| Uses `extends` | Uses `implements` |
| Supports single inheritance | Supports multiple inheritance |

---

## 📌 Key Points

- Abstraction is an OOP concept.
- It hides implementation details.
- Shows only essential features.
- Achieved using Abstract Classes and Interfaces.
- Abstract Classes cannot be instantiated.
- Abstract Methods do not have a method body.
- Child classes must implement abstract methods.

---

## 🚀 Quick Revision

- Abstraction = Hide implementation
- Show only essential features
- `abstract` keyword
- `interface` keyword
- Cannot create object of Abstract Class
- Child class implements abstract methods
- Improves security and maintainability

---

## 📚 Conclusion

Abstraction is an important OOP principle that hides implementation details while exposing only the essential functionality. It helps reduce complexity, improves maintainability, and allows developers to build flexible and secure applications using Abstract Classes and Interfaces.