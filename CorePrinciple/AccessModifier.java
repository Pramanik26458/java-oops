
/*
==========================================================
                ACCESS MODIFIERS IN JAVA
==========================================================

Java provides four access modifiers:

1. public
2. private
3. protected
4. default (package-private)

Each example below demonstrates how a specific access
modifier works.

Uncomment one example at a time to run it.
*/




// ==========================================================
// 1. PUBLIC ACCESS MODIFIER
// ==========================================================

// class Employee {
//
//     public String name;
//
//     public void displayName() {
//         System.out.println("Employee Name: " + name);
//     }
// }
//
// public class AccessModifier {
//     public static void main(String[] args) {
//
//         Employee employee = new Employee();
//
//         employee.name = "Ram";
//
//         employee.displayName();
//     }
// }




// ==========================================================
// 2. PRIVATE ACCESS MODIFIER
// ==========================================================

// class BankAccount {
//
//     private double balance;
//
//     public double getBalance() {
//         return balance;
//     }
//
//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//         }
//     }
// }
//
// public class AccessModifier {
//     public static void main(String[] args) {
//
//         BankAccount account = new BankAccount();
//
//         account.deposit(5000);
//
//         // System.out.println(account.balance); ❌ Not Accessible
//
//         System.out.println("Balance: " + account.getBalance());
//     }
// }




// ==========================================================
// 3. PROTECTED ACCESS MODIFIER
// ==========================================================

// class Vehicle {
//
//     protected String type;
//
//     protected void displayType() {
//         System.out.println("Vehicle Type: " + type);
//     }
// }
//
// class Car extends Vehicle {
//
//     public Car() {
//         type = "Car";
//     }
// }
//
// public class AccessModifier {
//     public static void main(String[] args) {
//
//         Car car = new Car();
//
//         System.out.println(car.type);
//
//         car.displayType();
//     }
// }




// ==========================================================
// 4. DEFAULT (PACKAGE-PRIVATE) ACCESS MODIFIER
// ==========================================================

class PackageDemo {

    void showMessage() {
        System.out.println("Default access in the same package.");
    }
}

public class AccessModifier {

    public static void main(String[] args) {

        PackageDemo demo = new PackageDemo();

        demo.showMessage();
    }
}