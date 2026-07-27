# 🔌 Interface in Java

## 📖 What is an Interface?

An **Interface** in Java is a blueprint of a class that defines **what a class should do**, but not **how it should do it**.

It is mainly used to achieve **100% abstraction** and **multiple inheritance**.

A class implements an interface using the **`implements`** keyword.

> **Interface = Contract that a class must follow**

---

## 🎯 Why Do We Need Interfaces?

- Achieve abstraction.
- Support multiple inheritance.
- Improve code reusability.
- Reduce coupling between classes.
- Make applications more flexible and maintainable.

---

## ⚙️ How Interface Works

1. Create an interface using the `interface` keyword.
2. Declare methods without implementation.
3. Create a class using the `implements` keyword.
4. The implementing class must provide the implementation of all interface methods.

---

## 🌍 Real-Life Example

Think of a **Remote Control**.

The remote has buttons like:

- Power
- Volume
- Channel

You know what each button does, but you don't know how the TV performs those actions internally.

Similarly, an interface defines **what should be done**, while the implementing class defines **how it is done**.

---

## 💻 Simple Example

```java
interface Animal {

    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## 🔑 Rules of Interface

- Interface is declared using the `interface` keyword.
- A class uses the `implements` keyword to implement an interface.
- Interface methods are `public` and `abstract` by default.
- Variables inside an interface are `public`, `static`, and `final` by default.
- An interface cannot be instantiated.
- A class can implement multiple interfaces.

---

## ✅ Advantages

- Supports multiple inheritance.
- Provides 100% abstraction.
- Improves code flexibility.
- Promotes loose coupling.
- Makes code easier to maintain and extend.

---

## ❌ Disadvantages

- Requires additional implementation classes.
- Can increase project complexity.
- Every implementing class must define all abstract methods (unless default methods are used).

---

## 📝 Interview Questions

### 1. What is an Interface?

An Interface is a blueprint of a class that contains abstract methods and is used to achieve abstraction and multiple inheritance.

---

### 2. Which keyword is used to create an Interface?

The `interface` keyword.

---

### 3. Which keyword is used to implement an Interface?

The `implements` keyword.

---

### 4. Can we create an object of an Interface?

No.

Interfaces cannot be instantiated.

---

### 5. Can a class implement multiple Interfaces?

Yes.

Java allows a class to implement multiple interfaces.

Example:

```java
class Student implements Printable, Serializable {

}
```

---

### 6. Why are Interfaces used?

Interfaces are used to:

- Achieve abstraction.
- Support multiple inheritance.
- Define a common contract for different classes.
- Improve flexibility and maintainability.

---

### 7. What is the difference between `extends` and `implements`?

- `extends` → Used to inherit a class.
- `implements` → Used to implement an interface.

---

## 📊 Abstract Class vs Interface

| Abstract Class | Interface |
|----------------|-----------|
| Uses `abstract` keyword | Uses `interface` keyword |
| Uses `extends` | Uses `implements` |
| Can have abstract and concrete methods | Methods are abstract by default |
| Supports single inheritance | Supports multiple inheritance |
| Can have constructors | Cannot have constructors |
| Can have instance variables | Variables are `public static final` by default |

---

## 📌 Key Points

- Interface is a blueprint of a class.
- Uses the `interface` keyword.
- Implemented using the `implements` keyword.
- Supports abstraction.
- Supports multiple inheritance.
- Cannot be instantiated.
- Methods are `public` and `abstract` by default.
- Variables are `public static final` by default.

---

## 🚀 Quick Revision

- Interface = Blueprint
- Keyword → `interface`
- Implement using → `implements`
- Supports 100% abstraction
- Supports multiple inheritance
- Cannot create an object
- Methods → `public abstract`
- Variables → `public static final`

---

## 📚 Conclusion

An Interface is a powerful feature in Java that defines a contract for classes. It helps achieve abstraction, supports multiple inheritance, and makes applications more flexible, maintainable, and reusable by separating **what should be done** from **how it is implemented**.