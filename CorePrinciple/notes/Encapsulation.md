# 🔒 Encapsulation in Java

## 📖 What is Encapsulation?

Encapsulation is one of the four pillars of Object-Oriented Programming (OOP).

It is the process of **binding data (variables) and methods (functions) together into a single unit (class)** while **restricting direct access to the data**.

Instead of accessing variables directly, we use **Getter** and **Setter** methods to read and update them.

> **Encapsulation = Data + Methods + Data Hiding**

---

## 🎯 Why Do We Need Encapsulation?

- Protects object data from unauthorized access.
- Prevents invalid or accidental modification of data.
- Allows validation before updating values.
- Makes the code more secure and maintainable.
- Gives controlled access to class members.

---

## ⚙️ How Encapsulation Works

1. Declare variables as `private`.
2. Create **Getter** methods to read the values.
3. Create **Setter** methods to update the values.
4. Access the data only through these methods.

---

## 🌍 Real-Life Example

Think of an **ATM**.

You cannot directly change your bank balance. Instead, you use options like **Deposit**, **Withdraw**, or **Check Balance**. The ATM verifies your request before updating your account.

Similarly, encapsulation allows controlled access to an object's data instead of direct access.

---

## 💻 Simple Example

```java
class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

---

## ✅ Advantages of Encapsulation

- Improves data security.
- Supports data hiding.
- Prevents invalid data.
- Makes code easier to maintain.
- Provides controlled access to data.
- Improves code reusability.

---

## ❌ Disadvantages

- Requires writing additional Getter and Setter methods.
- Slightly increases the amount of code.
- Can make simple programs a bit longer.

---

## 📝 Interview Questions

### 1. What is Encapsulation?

Encapsulation is the process of wrapping data and methods into a single class while restricting direct access to the data using private variables and providing controlled access through Getter and Setter methods.

---

### 2. How is Encapsulation achieved in Java?

- Make variables `private`.
- Create `public` Getter and Setter methods.
- Access the variables only through these methods.

---

### 3. Why are Getter and Setter methods used?

Getter methods are used to read data, while Setter methods are used to update data in a controlled way.

---

### 4. What is the difference between Encapsulation and Data Hiding?

- **Encapsulation** is the process of wrapping data and methods together.
- **Data Hiding** is the practice of restricting direct access to data using access modifiers like `private`.

Encapsulation helps achieve data hiding.

---

## 📌 Key Points

- Encapsulation is an OOP concept.
- It combines data and methods into one class.
- Variables are usually declared as `private`.
- Getter methods are used to read data.
- Setter methods are used to update data.
- It provides controlled access to data.
- It improves security and maintainability.

---

## 🚀 Quick Revision

- Encapsulation = Data + Methods + Data Hiding
- Variables → `private`
- Read data → Getter
- Update data → Setter
- Prevents direct access
- Improves security
- Supports validation
- Makes code maintainable

---

## 📚 Conclusion

Encapsulation is an important OOP principle that protects an object's data by restricting direct access. It uses private variables along with Getter and Setter methods to provide controlled, secure, and maintainable access to data.