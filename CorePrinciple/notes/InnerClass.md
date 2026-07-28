# Java Inner Classes

## What is an Inner Class?

An **Inner Class** is a class that is declared inside another class. It helps group related classes together, improves code readability, and provides better encapsulation.

Java provides **four types of inner classes**:

1. Static Nested Class
2. Member Inner Class (Non-Static)
3. Local Inner Class
4. Anonymous Inner Class

---

# 1. Static Nested Class

## Definition

A **Static Nested Class** is declared using the `static` keyword inside another class.

### Features

* Belongs to the outer class, not its object.
* Can access **only static members** of the outer class directly.
* Does not require an object of the outer class.
* Behaves almost like a normal class.

### Syntax

```java
class Outer {

    static class Nested {

    }
}
```

### Object Creation

```java
Outer.Nested obj = new Outer.Nested();
```

### Use Case

Use a static nested class when the inner class does not need access to the instance variables or methods of the outer class.

---

# 2. Member Inner Class (Non-Static)

## Definition

A **Member Inner Class** is a normal class declared inside another class without using the `static` keyword.

### Features

* Requires an object of the outer class.
* Can access both **instance** and **static** members of the outer class.
* Used when the inner class is closely related to an object of the outer class.

### Syntax

```java
class Outer {

    class Inner {

    }
}
```

### Object Creation

```java
Outer outer = new Outer();
Outer.Inner obj = outer.new Inner();
```

### Use Case

Use a member inner class when the inner class needs to work with the data of a specific outer class object.

---

# 3. Local Inner Class

## Definition

A **Local Inner Class** is declared inside a method, constructor, or block.

### Features

* Exists only inside that method.
* Cannot be accessed outside the method.
* Can access local variables only if they are **final or effectively final**.
* Mainly used for temporary helper classes.

### Syntax

```java
void display() {

    class Local {

    }

    Local obj = new Local();
}
```

### Use Case

Used when the class is required only for a single method and nowhere else.

---

# 4. Anonymous Inner Class

## Definition

An **Anonymous Inner Class** is an inner class without a name.

It is created and instantiated in a single statement.

### Features

* Has no class name.
* Used only once.
* Cannot have a constructor.
* Commonly used with abstract classes, interfaces, and event handling.

### Syntax

```java
Greeting obj = new Greeting() {

    @Override
    void sayHello() {
        System.out.println("Hello");
    }
};
```

### Use Case

Used when only one implementation of an interface or abstract class is needed.

---

# Comparison Table

| Feature                 | Static Nested | Member Inner | Local Inner | Anonymous Inner |
| ----------------------- | ------------- | ------------ | ----------- | --------------- |
| Has Name                | ✅ Yes         | ✅ Yes        | ✅ Yes       | ❌ No            |
| Uses `static`           | ✅ Yes         | ❌ No         | ❌ No        | ❌ No            |
| Needs Outer Object      | ❌ No          | ✅ Yes        | ✅ Yes       | Depends         |
| Access Instance Members | ❌ Directly No | ✅ Yes        | ✅ Yes       | ✅ Yes           |
| Declared Inside         | Class         | Class        | Method      | Expression      |
| Reusable                | ✅ Yes         | ✅ Yes        | ❌ Limited   | ❌ No            |

---

# Advantages of Inner Classes

* Improves encapsulation.
* Makes code more organized.
* Allows direct access to outer class members.
* Reduces unnecessary class creation.
* Helps in event handling and callback implementations.

---

# Disadvantages

* Can make code harder to read if overused.
* Creates tighter coupling between classes.
* Anonymous classes cannot be reused.
* Deep nesting reduces maintainability.

---

# Interview Questions

### Q1. What is an Inner Class?

An inner class is a class defined inside another class. It helps organize related classes and provides better encapsulation.

### Q2. How many types of inner classes are there?

There are four:

* Static Nested Class
* Member Inner Class
* Local Inner Class
* Anonymous Inner Class

### Q3. Which inner class does not require an outer class object?

**Static Nested Class.**

### Q4. Which inner class is declared inside a method?

**Local Inner Class.**

### Q5. Which inner class has no name?

**Anonymous Inner Class.**

### Q6. Can a local inner class access local variables?

Yes, but only if they are **final or effectively final**.

### Q7. Can an anonymous inner class have a constructor?

No. It cannot have a constructor because it has no name.

---

# Quick Revision

* **Static Nested Class** → Uses `static`, no outer object required.
* **Member Inner Class** → Needs outer object, accesses all outer members.
* **Local Inner Class** → Declared inside a method, used temporarily.
* **Anonymous Inner Class** → No name, one-time implementation.

---

# One-Line Memory Trick

* **Static** → Independent
* **Member** → Belongs to Object
* **Local** → Inside Method
* **Anonymous** → One-Time Use
