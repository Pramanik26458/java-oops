# Object Lifecycle in Java

> A complete guide to understanding the lifecycle of an object in Java.

---

# Table of Contents

1. What is an Object?
2. Object Lifecycle
3. Object Creation
4. Object Initialization
5. Object Usage
6. Object Becomes Eligible for Garbage Collection
7. Garbage Collection
8. Finalization (Deprecated)
9. Complete Lifecycle Diagram
10. Example Program
11. Interview Questions

---

# 1. What is an Object?

An object is an instance of a class.

It occupies memory in the heap and contains:

- State (Fields/Variables)
- Behavior (Methods)

```java
class Student {
    String name;
}

Student s = new Student();
```

Here, `s` is a reference variable and the actual object is stored inside the Heap Memory.

---

# 2. Object Lifecycle

Every Java object goes through these stages:

```
Class Loaded
      │
      ▼
Object Created (new)
      │
      ▼
Initialization (Constructor)
      │
      ▼
Object in Use
      │
      ▼
Reference Lost
      │
      ▼
Eligible for Garbage Collection
      │
      ▼
Garbage Collector Removes Object
```

---

# 3. Object Creation

Objects are generally created using the `new` keyword.

```java
Student s = new Student();
```

### What happens internally?

1. JVM allocates memory in Heap.
2. Instance variables get default values.
3. Constructor is called.
4. Object reference is returned.

Memory Representation

```
Stack
-----
s
 |
 ▼

Heap
---------------
Student Object
---------------
name = null
---------------
```

---

# 4. Object Initialization

Initialization happens through constructors.

```java
class Student {

    String name;

    Student() {
        name = "Basak";
    }
}
```

```java
Student s = new Student();
```

Output

```
Object initialized
```

Constructors initialize the object before it can be used.

---

# 5. Object Usage

Once initialized, the object can call methods and access variables.

```java
class Student {

    String name = "Basak";

    void display() {
        System.out.println(name);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s = new Student();

        s.display();
    }
}
```

Output

```
Basak
```

---

# 6. Object Becomes Eligible for Garbage Collection

Java automatically destroys unused objects.

An object becomes eligible when no live references point to it.

Example 1

```java
Student s = new Student();

s = null;
```

Example 2

```java
Student s1 = new Student();
Student s2 = new Student();

s1 = s2;
```

The first object has no reference now.

Example 3

```java
new Student();
```

No reference is stored.

Immediately eligible for Garbage Collection.

---

# 7. Garbage Collection

Java uses an automatic Garbage Collector.

Developer **cannot explicitly destroy objects**.

Instead, JVM checks:

- Is the object reachable?
- Is there any reference?

If not,

Garbage Collector frees the memory.

Example

```java
Student s = new Student();

s = null;

System.gc();   // Request JVM
```

Output

```
GC may run
```

> `System.gc()` only requests garbage collection. The JVM may ignore the request.

---

# 8. Finalization (Deprecated)

Earlier Java had a method called:

```java
protected void finalize()
```

Example

```java
class Student {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }
}
```

### Why Deprecated?

- Unpredictable
- Slow
- Not guaranteed to execute
- Removed from modern Java practices

Instead, use:

- Try-with-resources
- AutoCloseable
- Explicit resource cleanup

---

# 9. Complete Lifecycle Diagram

```
             new
              │
              ▼
     Object Created
              │
              ▼
     Constructor Executes
              │
              ▼
     Object Initialized
              │
              ▼
      Methods Called
              │
              ▼
   Object No Longer Used
              │
              ▼
 Eligible for Garbage Collection
              │
              ▼
     Garbage Collector Frees Memory
```

---

# 10. Complete Example

```java
class Student {

    String name;

    Student(String name) {
        this.name = name;
        System.out.println("Constructor called");
    }

    void display() {
        System.out.println("Name : " + name);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s = new Student("Basak");

        s.display();

        s = null;

        System.gc();

        System.out.println("End of Program");
    }
}
```

Possible Output

```
Constructor called
Name : Basak
End of Program
```

Garbage collection may happen later.

---

# 11. Interview Questions

### Q1. What is the lifecycle of an object?

**Answer:**

1. Object Creation
2. Constructor Execution
3. Initialization
4. Object Usage
5. Eligible for Garbage Collection
6. Garbage Collection

---

### Q2. Where are objects stored?

**Answer:**

Objects are stored in the **Heap Memory**.

Reference variables are stored in the **Stack Memory** (for local variables).

---

### Q3. Which keyword creates an object?

**Answer:**

```java
new
```

---

### Q4. Can we manually destroy an object in Java?

**Answer:**

No.

Java uses Automatic Garbage Collection.

---

### Q5. Is `System.gc()` guaranteed to run Garbage Collection?

**Answer:**

No.

It only requests the JVM to perform garbage collection.

---

### Q6. When does an object become eligible for Garbage Collection?

**Answer:**

When there are no reachable references pointing to that object.

---

### Q7. Why was `finalize()` deprecated?

**Answer:**

Because it is:

- Unpredictable
- Inefficient
- Not guaranteed to execute
- Replaced by better resource management techniques like `AutoCloseable` and try-with-resources.

---

# Quick Revision

```
Class
   │
   ▼
new Keyword
   │
   ▼
Memory Allocated (Heap)
   │
   ▼
Constructor Executes
   │
   ▼
Object Ready
   │
   ▼
Methods Execute
   │
   ▼
Reference Removed
   │
   ▼
Eligible for GC
   │
   ▼
Garbage Collector Removes Object
```

---

# Key Takeaways

- Objects are created using the `new` keyword.
- Memory for objects is allocated in the Heap.
- Constructors initialize objects.
- Objects remain alive as long as they are reachable.
- Java automatically manages memory through Garbage Collection.
- `System.gc()` is only a request to the JVM.
- `finalize()` is deprecated and should not be used in modern Java.