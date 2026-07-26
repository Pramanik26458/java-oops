# 🎭 Polymorphism in Java

## 📖 What is Polymorphism?

Polymorphism is one of the four pillars of Object-Oriented Programming (OOP).

The word **Polymorphism** comes from two Greek words:

- **Poly** → Many
- **Morph** → Forms

It means **"One object or method can have many forms or behaviors."**

In Java, polymorphism allows the same method name to perform different tasks depending on the object or parameters.

> **Polymorphism = One Interface, Multiple Forms**

---

## 🎯 Why Do We Need Polymorphism?

- Increases code flexibility.
- Improves code reusability.
- Makes code easier to maintain.
- Allows different objects to respond differently to the same method call.
- Supports runtime decision-making.

---

## ⚙️ Types of Polymorphism

Java supports two types of polymorphism:

### 1. Compile-Time Polymorphism (Method Overloading)

- Achieved by **Method Overloading**.
- Methods have the **same name** but **different parameters**.
- The method is selected during **compile time**.

---

### 2. Runtime Polymorphism (Method Overriding)

- Achieved by **Method Overriding**.
- The child class provides its own implementation of the parent's method.
- The method is selected during **runtime**.

---

## 🌍 Real-Life Example

Think of a person.

A single person behaves differently in different situations.

- At home → Son/Daughter
- At college → Student
- At office → Employee

The same person has different roles depending on the situation.

Similarly, in Java, the same method can behave differently depending on the object.

---

## 💻 Simple Example

```java
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## 🔹 Method Overloading

Method Overloading means creating multiple methods with the **same name** but **different parameters**.

Example:

```java
class Calculator {

    int add(int a, int b) {}

    int add(int a, int b, int c) {}
}
```

---

## 🔹 Method Overriding

Method Overriding means a child class provides its own implementation of a method that already exists in the parent class.

Example:

```java
class Animal {

    void sound() {}
}

class Dog extends Animal {

    @Override
    void sound() {}
}
```

---

## ✅ Advantages

- Improves code reusability.
- Makes programs more flexible.
- Supports dynamic method dispatch.
- Makes applications easier to extend.
- Reduces code duplication.

---

## ❌ Disadvantages

- Can make debugging more difficult.
- Runtime polymorphism has a slight performance overhead.
- Deep inheritance may increase complexity.

---

## 📝 Interview Questions

### 1. What is Polymorphism?

Polymorphism is an OOP concept that allows one method or object to have multiple forms or behaviors.

---

### 2. How many types of Polymorphism are there in Java?

There are two types:

- Compile-Time Polymorphism
- Runtime Polymorphism

---

### 3. What is Compile-Time Polymorphism?

Compile-Time Polymorphism is achieved using **Method Overloading**, where methods have the same name but different parameters.

---

### 4. What is Runtime Polymorphism?

Runtime Polymorphism is achieved using **Method Overriding**, where a child class provides its own implementation of a parent's method.

---

### 5. What is Method Overloading?

Method Overloading means defining multiple methods with the same name but different parameter lists in the same class.

---

### 6. What is Method Overriding?

Method Overriding means redefining a method in the child class that already exists in the parent class.

---

### 7. What is the difference between Method Overloading and Method Overriding?

| Method Overloading | Method Overriding |
|--------------------|-------------------|
| Same class | Parent and Child class |
| Same method name | Same method name |
| Different parameters | Same parameters |
| Compile-time | Runtime |

---

## 📌 Key Points

- Polymorphism means **One Interface, Multiple Forms**.
- Java supports two types of polymorphism.
- Method Overloading → Compile-Time Polymorphism.
- Method Overriding → Runtime Polymorphism.
- Improves flexibility and reusability.
- Supports dynamic method dispatch.

---

## 🚀 Quick Revision

- Poly = Many
- Morph = Forms
- Two Types:
  - Compile-Time → Method Overloading
  - Runtime → Method Overriding
- Overloading → Different Parameters
- Overriding → Same Method, Different Implementation
- Improves flexibility and code reuse

---

## 📚 Conclusion

Polymorphism is a powerful OOP principle that allows the same method or object to behave differently in different situations. It improves flexibility, reusability, and maintainability, making Java applications more dynamic and scalable.