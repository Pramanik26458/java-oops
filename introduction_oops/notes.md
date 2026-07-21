# 📘 Object-Oriented Programming (OOPS) Notes

> My complete OOPS learning journey in Java.
>
> 📅 Started: July 2026

---

# 📑 Table of Contents

- [1. What is OOPS?](#1-what-is-oops)
- [2. Classes and Objects](#2-classes-and-objects)
- [3. Attributes and Methods](#3-attributes-and-methods)
- [4. Encapsulation](#4-encapsulation)
- [5. Constructors](#5-constructors)
- [6. Inheritance](#6-inheritance)
- [7. Polymorphism](#7-polymorphism)
- [8. Abstraction](#8-abstraction)
- [9. Interfaces](#9-interfaces)
- [10. Collections](#10-collections)

---

# 1. What is OOPS?

## Definition

**Object-Oriented Programming System (OOPS)** is a programming paradigm that organizes programs using **Objects** instead of only functions.

It helps developers write code that is reusable, modular, maintainable, and closer to real-world scenarios.

An object contains:

- Data (Attributes)
- Behaviour (Methods)

---

## Why OOPS?

OOPS is introduced to solve the problems of procedural programming.

Benefits include:

- Code Reusability
- Easy Maintenance
- Better Organization
- High Security
- Easy Debugging
- Scalable Applications

---

## Real World Example

Consider a **Car**.

### Attributes

- Brand
- Model
- Color
- Speed

### Methods

- start()
- stop()
- accelerate()
- brake()

A real-world object can be represented as an object inside a program.

---

## Advantages

- Reusable Code
- Modular Design
- Better Security
- Easy Maintenance
- Less Code Duplication
- Real World Mapping

---

## Four Pillars of OOPS

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

---

# 2. Classes and Objects

## What is a Class?

A **Class** is a blueprint or template used to create objects.

It defines:

- Attributes (Variables)
- Methods (Functions)

A class does not occupy memory until an object is created.

### Example

```java
class Student {

    String name;
    int age;

    void study() {
        System.out.println("Student is studying");
    }
}
```

Here,

- Student → Class
- name, age → Attributes
- study() → Method

---

## What is an Object?

An **Object** is an instance of a class.

Objects contain actual values for the attributes defined inside the class.

Objects occupy memory.

### Example

```java
Student s1 = new Student();
```

Here,

- Student → Class
- s1 → Object
- new → Creates a new object

---

## Creating Multiple Objects

```java
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();
```

Each object has its own copy of data.

---

## Class vs Object

| Class | Object |
|--------|---------|
| Blueprint | Instance |
| Logical Entity | Physical Entity |
| No Memory | Occupies Memory |
| Used to Create Objects | Created from Class |

---

## Real World Example

Class

```
Car
```

Objects

```
BMW
Audi
Tesla
Toyota
```

All these cars are objects created from the Car class.

---

# 3. Attributes and Methods

## What are Attributes?

Attributes are variables declared inside a class.

They represent the properties or characteristics of an object.

### Example

```java
class Student {

    String name;
    int age;
    double cgpa;
}
```

Here,

- name
- age
- cgpa

are attributes.

---

## What are Methods?

Methods define the behaviour or actions performed by an object.

### Example

```java
class Student {

    void study() {
        System.out.println("Studying...");
    }

    void sleep() {
        System.out.println("Sleeping...");
    }
}
```

study() and sleep() are methods.

---

## Accessing Attributes

```java
Student s1 = new Student();

s1.name = "Basak";
s1.age = 21;

System.out.println(s1.name);
System.out.println(s1.age);
```

Use the **dot (.) operator** to access attributes.

---

## Calling Methods

```java
Student s1 = new Student();

s1.study();
s1.sleep();
```

Methods are also accessed using the dot operator.

---

## Complete Example

```java
class Student {

    String name;
    int age;

    void introduce() {
        System.out.println("Hello, I am " + name);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Basak";
        s1.age = 21;

        s1.introduce();
    }
}
```

Output

```
Hello, I am Basak
```

---

## Attributes vs Methods

| Attributes | Methods |
|------------|----------|
| Store Data | Perform Actions |
| Variables | Functions |
| Describe Object | Define Behaviour |

---

# 4. Encapsulation

> **Coming Soon...**

---

# 5. Constructors

> **Coming Soon...**

---

# 6. Inheritance

> **Coming Soon...**

---

# 7. Polymorphism

> **Coming Soon...**

---

# 8. Abstraction

> **Coming Soon...**

---

# 9. Interfaces

> **Coming Soon...**

---

# 10. Collections

> **Coming Soon...**

---

# 📌 Quick Revision

## OOPS

- Programming paradigm based on objects.
- Objects contain attributes and methods.
- Makes software reusable and maintainable.

### Class

Blueprint used to create objects.

### Object

Instance of a class.

### Attributes

Variables that store data.

### Methods

Functions that define behaviour.

---

# 🎯 Interview Questions

### What is OOPS?

Object-Oriented Programming System is a programming paradigm that uses classes and objects to build software.

---

### What is a Class?

A class is a blueprint used to create objects.

---

### What is an Object?

An object is an instance of a class.

---

### What are Attributes?

Attributes are variables that represent the properties of an object.

---

### What are Methods?

Methods are functions that define the behaviour of an object.

---

### Difference between Class and Object?

| Class | Object |
|--------|---------|
| Blueprint | Instance |
| Logical Entity | Physical Entity |
| No Memory | Occupies Memory |

---

### What are the four pillars of OOPS?

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

---

> 🚀 This file will continue to grow as I learn more about Object-Oriented Programming.