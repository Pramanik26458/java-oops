# 🔐 Access Modifiers in Java

## 📖 What are Access Modifiers?

Access Modifiers are **keywords** in Java that control the **visibility and accessibility** of classes, variables, methods, and constructors.

They define **who can access a member** from different parts of the program.

---

## 🎯 Why Do We Need Access Modifiers?

- Protect sensitive data.
- Control access to class members.
- Improve security.
- Support encapsulation.
- Make code easier to manage and maintain.

---

## 🔑 Types of Access Modifiers

Java provides **four** access modifiers:

### 1. `public`

- Accessible from **anywhere** in the program.
- Can be accessed from any class and any package.

---

### 2. `private`

- Accessible **only within the same class**.
- Cannot be accessed directly from outside the class.

---

### 3. `protected`

- Accessible within the **same package**.
- Also accessible in **subclasses (child classes)**, even if they are in different packages.

---

### 4. Default (No Modifier)

- Also called **Package-Private**.
- Accessible only within the **same package**.
- Not accessible from outside the package.

---

## 💻 Simple Example

```java
public class Student {

    public String college;
    private int age;
    protected String branch;
    String name; // Default
}
```

---

## 📊 Access Modifier Table

| Access Modifier | Same Class | Same Package | Subclass (Different Package) | Different Package |
|----------------|:----------:|:------------:|:----------------------------:|:-----------------:|
| **public** | ✅ | ✅ | ✅ | ✅ |
| **protected** | ✅ | ✅ | ✅ | ❌ |
| **default** | ✅ | ✅ | ❌ | ❌ |
| **private** | ✅ | ❌ | ❌ | ❌ |

---

## ✅ Advantages

- Provides data security.
- Controls access to program members.
- Supports encapsulation.
- Prevents unauthorized access.
- Improves code organization.

---

## ❌ Disadvantages

- Incorrect use can make code difficult to access.
- Requires understanding of packages and inheritance.

---

## 📝 Interview Questions

### 1. What are Access Modifiers?

Access Modifiers are keywords that control the accessibility of classes, methods, variables, and constructors in Java.

---

### 2. How many Access Modifiers are available in Java?

There are **four** access modifiers:

- public
- private
- protected
- default (package-private)

---

### 3. Which Access Modifier is the most restrictive?

`private` is the most restrictive because it can only be accessed within the same class.

---

### 4. Which Access Modifier is the least restrictive?

`public` is the least restrictive because it can be accessed from anywhere.

---

### 5. What is the default Access Modifier in Java?

If no access modifier is specified, Java uses the **default (package-private)** access modifier.

---

## 📌 Key Points

- Access Modifiers control accessibility.
- Java has four access modifiers.
- `public` → Accessible everywhere.
- `private` → Accessible only within the same class.
- `protected` → Accessible within the same package and subclasses.
- `default` → Accessible only within the same package.

---
## 🚀 Quick Revision

- `public` → Everywhere ✅
- `private` → Same class only ✅
- `protected` → Same package + Child class ✅
- `default` → Same package only ✅

---

## 📚 Conclusion

Access Modifiers help control the visibility of classes and class members. They improve security, support encapsulation, and ensure that data and methods are accessed only where appropriate.