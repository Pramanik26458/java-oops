# ☕ Java Basics

> **"Write Once, Run Anywhere (WORA)"**

Welcome to the first chapter of the **Complete Java Handbook**.

Java is one of the world's most popular programming languages and has been trusted by developers for nearly three decades. It powers millions of applications ranging from enterprise software and Android applications to cloud services, banking systems, e-commerce platforms, and large-scale distributed systems.

Before diving into Object-Oriented Programming (OOP), it's essential to understand the core building blocks of Java. This chapter lays the foundation by covering Java's syntax, data types, variables, operators, arrays, strings, control statements, exception handling, and much more.

---

# 📚 Table of Contents

- What is Java?
- Why Java?
- Features of Java
- Java Architecture
- Write Once, Run Anywhere (WORA)
- Java Program Structure
- Comments
- Variables
- Data Types
- Operators
- Strings
- Input & Output
- Type Casting
- Constants
- Arrays
- Conditional Statements
- Loops
- Exception Handling
- Best Practices
- Common Mistakes
- Summary

---

# 📖 What is Java?

Java is a **high-level, class-based, object-oriented programming language** that is designed to have as few implementation dependencies as possible.

It is a **general-purpose programming language** intended to let application developers **write once, run anywhere (WORA)**, meaning that compiled Java code can run on all platforms that support Java **without the need for recompilation**.

Instead of compiling directly into machine code, Java source code is compiled into an intermediate format called **Bytecode**, which is executed by the **Java Virtual Machine (JVM)**. This architecture makes Java one of the most portable programming languages in the world.

---

# 🎯 Why Learn Java?

Java is one of the most valuable programming languages for software development because it is:

- Platform Independent
- Object-Oriented
- Secure
- Robust
- Scalable
- Portable
- Multithreaded
- Easy to Learn
- Rich in Libraries
- Widely Used in Industry

Java is commonly used in:

- 🏦 Banking Applications
- 📱 Android Development
- 🌐 Backend Development
- ☁ Cloud Computing
- 🛒 E-Commerce Platforms
- 🏢 Enterprise Applications
- 💹 Financial Systems
- 📊 Big Data Technologies

---

# ⭐ Features of Java

| Feature | Description |
|----------|-------------|
| Platform Independent | Runs on any operating system with JVM |
| Object-Oriented | Everything revolves around classes and objects |
| Secure | No direct memory access, bytecode verification |
| Robust | Strong exception handling and garbage collection |
| Portable | Same bytecode runs everywhere |
| Multithreaded | Execute multiple tasks simultaneously |
| Dynamic | Supports dynamic class loading |
| High Performance | Uses Just-In-Time (JIT) Compiler |

---

# 🌍 Write Once, Run Anywhere (WORA)

One of Java's greatest strengths is its **platform independence**.

Instead of compiling directly into machine code like C or C++, Java follows a two-step compilation process.

```
Java Source Code (.java)
            │
            ▼
        Java Compiler
          (javac)
            │
            ▼
     Bytecode (.class)
            │
            ▼
    Java Virtual Machine
            │
 ┌──────────┼──────────┐
 ▼          ▼          ▼
Windows    Linux     macOS
```

As long as a system has a **Java Virtual Machine (JVM)** installed, the same Java program can run without any changes.

This is known as **Write Once, Run Anywhere (WORA)**.

---

# 🏗 Java Architecture

Java follows a layered execution model.

```
Java Source Code
        │
        ▼
     javac Compiler
        │
        ▼
      Bytecode
        │
        ▼
         JVM
        │
        ▼
 Operating System
        │
        ▼
     Hardware
```

### Components

### JDK (Java Development Kit)

Used for developing Java applications.

Includes:

- Compiler (`javac`)
- JVM
- JRE
- Development Tools

---

### JRE (Java Runtime Environment)

Provides everything required to run Java programs.

Includes:

- JVM
- Java Libraries

---

### JVM (Java Virtual Machine)

The JVM converts Java bytecode into machine code specific to the operating system.

It is responsible for:

- Loading Classes
- Memory Management
- Garbage Collection
- Security
- Bytecode Execution

---

# 🌍 Real-World Analogy

Imagine writing a book in English.

People from different countries can read the same book if they have a translator.

Similarly,

```
Java Source Code
       ↓
English Book

Bytecode
       ↓
Universal Language

JVM
       ↓
Translator

Windows/Linux/macOS
       ↓
Readers
```

The translator changes the same English book into different languages.

Similarly, the JVM converts Java Bytecode into machine code for each operating system.

---

# 🚀 Java Program Structure

Every Java program starts from the **main()** method.

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, World!");

    }

}
```

## Explanation

| Keyword | Description |
|----------|-------------|
| public | Accessible from anywhere |
| class | Blueprint of objects |
| static | Runs without creating an object |
| void | No return value |
| main() | Entry point of the application |
| String[] args | Command-line arguments |
| System.out.println() | Prints output to the console |

### Output

```
Hello, World!
```

---

# 💬 Comments

Comments are ignored by the compiler and are used to improve code readability.

### Single-line Comment

```java
// This is a single-line comment
```

### Multi-line Comment

```java
/*
This is a
multi-line
comment.
*/
```

---

# 📦 Variables

Variables are named memory locations used to store data.

### Syntax

```java
dataType variableName = value;
```

### Example

```java
int age = 21;

double cgpa = 9.15;

char grade = 'A';

boolean placed = false;
```

---

# 📊 Data Types

Java has **8 primitive data types**.

| Data Type | Size | Example |
|-----------|------|---------|
| byte | 1 Byte | 100 |
| short | 2 Bytes | 1000 |
| int | 4 Bytes | 100000 |
| long | 8 Bytes | 100000L |
| float | 4 Bytes | 3.14f |
| double | 8 Bytes | 3.141592 |
| char | 2 Bytes | 'A' |
| boolean | 1 Bit | true |

---

# ➕ Operators

Java provides different types of operators.

## Arithmetic

```
+
-
*
/
%
```

## Relational

```
==
!=
>
<
>=
<=
```

## Logical

```
&&
||
!
```

## Assignment

```
=
+=
-=
*=
/=
%=
```

## Unary

```
++
--
```

---

# 🔤 Strings

A **String** is a sequence of characters used to store text.

Unlike primitive data types, Strings are **objects** in Java.

```java
String language = "Java";

System.out.println(language.length());

System.out.println(language.toUpperCase());

System.out.println(language.charAt(2));
```

---

# ⌨ Input & Output

Java uses the **Scanner** class for user input.

```java
Scanner sc = new Scanner(System.in);

String name = sc.nextLine();

int age = sc.nextInt();

System.out.println(name);

System.out.println(age);

sc.close();
```

---

# 🔄 Type Casting

## Implicit Casting

```java
int num = 10;

double value = num;
```

---

## Explicit Casting

```java
double pi = 3.14;

int number = (int) pi;
```

---

# 🔒 Constants

Use the `final` keyword to create constants.

```java
final double PI = 3.14159;
```

---

# 📚 Arrays

Arrays store multiple values of the same type.

```java
int[] marks = {90,80,70,60};

for(int value : marks){

    System.out.println(value);

}
```

---

# 🔀 Conditional Statements

## if

```java
if(age >= 18){

    System.out.println("Eligible");

}
```

## if-else

```java
if(age >= 18){

    System.out.println("Adult");

}else{

    System.out.println("Minor");

}
```

## switch

```java
switch(day){

case 1:
System.out.println("Monday");
break;

case 2:
System.out.println("Tuesday");
break;

default:
System.out.println("Invalid");
}
```

---

# 🔁 Loops

### for Loop

```java
for(int i=1;i<=5;i++){

    System.out.println(i);

}
```

### while Loop

```java
int i = 1;

while(i<=5){

    System.out.println(i);

    i++;

}
```

### do-while Loop

```java
int i=1;

do{

    System.out.println(i);

    i++;

}while(i<=5);
```

---

# ⚠ Exception Handling

Exception Handling prevents a program from terminating unexpectedly.

```java
try{

    int result = 10 / 0;

}catch(ArithmeticException e){

    System.out.println("Cannot divide by zero.");

}finally{

    System.out.println("Program Finished.");

}
```

---

# ✅ Best Practices

- Use meaningful variable names.
- Follow Java naming conventions.
- Always close resources like `Scanner`.
- Handle exceptions properly.
- Write readable code.
- Keep methods short and focused.
- Avoid unnecessary comments.

---

# ❌ Common Mistakes

- Comparing Strings using `==`
- Forgetting `break` in switch
- Not closing `Scanner`
- Ignoring exceptions
- Accessing invalid array indexes
- Forgetting the `f` suffix with `float`

---

# 📌 Summary

After completing this chapter, you should be able to:

- Understand Java's architecture and execution process.
- Explain the **Write Once, Run Anywhere (WORA)** principle.
- Write and execute basic Java programs.
- Work with variables, data types, operators, arrays, and strings.
- Use loops and conditional statements.
- Handle exceptions effectively.

These concepts form the foundation of Java programming and prepare you for learning **Object-Oriented Programming (OOP)**.

---

# 🚀 Next Chapter

➡ **Class & Object**

In the next chapter, you'll learn:

- What is a Class?
- What is an Object?
- Memory Representation
- Creating Objects
- Accessing Members
- Real-world Examples
- Interview Questions