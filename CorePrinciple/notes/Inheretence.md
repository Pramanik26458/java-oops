# 🌳 Inheritance in Java

## 📖 What is Inheritance?

Inheritance is one of the four pillars of Object-Oriented Programming (OOP).

It is the process by which **one class acquires the properties (variables) and behaviors (methods) of another class**.

The class that inherits is called the **Child Class (Subclass)**, and the class whose properties are inherited is called the **Parent Class (Superclass)**.

Java uses the **`extends`** keyword to achieve inheritance.

> **Inheritance = Reusing the properties and methods of an existing class**

---

## 🎯 Why Do We Need Inheritance?

- Promotes code reusability.
- Reduces code duplication.
- Makes code easier to maintain.
- Establishes a parent-child relationship between classes.
- Supports method overriding and runtime polymorphism.

---

## ⚙️ How Inheritance Works

Inheritance is achieved by following these steps:

1. Create a parent class.
2. Create a child class using the `extends` keyword.
3. The child class automatically gets access to the parent's public and protected members.
4. The child class can also add its own properties and methods.

---

## 🌍 Real-Life Example

Think of a **Vehicle** and a **Car**.

A **Car** is a type of **Vehicle**.

The car automatically has common properties like:

- Engine
- Wheels
- Speed

It can also have its own unique features like:

- Sunroof
- Music System

Similarly, a child class inherits common features from its parent class and can also have its own features.

---

## 💻 Simple Example

```java
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}
```

---

## 🏷️ Types of Inheritance in Java

### 1. Single Inheritance

One child class inherits from one parent class.

```
A
|
B
```

---

### 2. Multilevel Inheritance

A class inherits from another child class.

```
A
|
B
|
C
```

---

### 3. Hierarchical Inheritance

Multiple child classes inherit from the same parent class.

```
      A
    /   \
   B     C
```

---

### 4. Multiple Inheritance (Not Supported with Classes)

Java does **not support multiple inheritance using classes** because it can create ambiguity (Diamond Problem).

However, it can be achieved using **Interfaces**.

```
A     B
 \   /
   C
```

---

### 5. Hybrid Inheritance

Hybrid inheritance is a combination of different inheritance types.

Java supports hybrid inheritance **only through Interfaces**, not through classes.

---

## ✅ Advantages

- Promotes code reusability.
- Reduces duplicate code.
- Makes applications easier to maintain.
- Improves code organization.
- Supports polymorphism.
- Makes programs easier to extend.

---

## ❌ Disadvantages

- Creates tight coupling between classes.
- Deep inheritance can make code difficult to understand.
- Changes in the parent class may affect child classes.

---

## 📝 Interview Questions

### 1. What is Inheritance?

Inheritance is the process by which one class acquires the properties and methods of another class using the `extends` keyword.

---

### 2. Which keyword is used for Inheritance in Java?

The `extends` keyword is used to inherit a class.

---

### 3. What is a Parent Class?

A Parent Class (Superclass) is the class whose properties and methods are inherited by another class.

---

### 4. What is a Child Class?

A Child Class (Subclass) is the class that inherits properties and methods from the parent class.

---

### 5. How many types of Inheritance are there in Java?

There are five types:

- Single
- Multilevel
- Hierarchical
- Multiple (Not supported using classes)
- Hybrid (Supported using interfaces)

---

### 6. Why doesn't Java support Multiple Inheritance with classes?

Java does not support multiple inheritance with classes to avoid ambiguity, also known as the **Diamond Problem**.

---

## 📌 Key Points

- Inheritance is an OOP concept.
- It allows one class to inherit another class.
- Uses the `extends` keyword.
- Promotes code reusability.
- Supports method overriding.
- Java does not support multiple inheritance using classes.
- Interfaces can be used to achieve multiple inheritance.

---

## 🚀 Quick Revision

- Inheritance = Reuse existing code
- Parent Class = Superclass
- Child Class = Subclass
- Keyword → `extends`
- Improves code reusability
- Supports method overriding
- Multiple inheritance ❌ (Classes)
- Multiple inheritance ✅ (Interfaces)

---

## 📚 Conclusion

Inheritance is an important OOP principle that allows one class to inherit the properties and methods of another class. It promotes code reusability, reduces duplication, and makes applications easier to maintain and extend.