package Relationship_objectBehaviour;
import java.util.*;

/*
===========================================================
           Aggregation vs Composition in Java
===========================================================

1. Aggregation (Has-A Relationship)
   - Weak relationship
   - Objects can exist independently

2. Composition (Part-Of Relationship)
   - Strong relationship
   - Child objects cannot exist without the parent

===========================================================
*/


// ===========================================================
// 1. AGGREGATION
// ===========================================================

/*
Example:
Department has Employees.

Employees can exist even if the Department is deleted.
Therefore, this is Aggregation.
*/

// -------------------------
// Employee Class
// -------------------------
class Employee {

    private String name;

    Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


// -------------------------
// Department Class
// -------------------------
class Department {

    private List<Employee> employees;

    Department(List<Employee> employees) {
        this.employees = employees;
    }

    public void displayEmployees() {

        System.out.println("Department Employees");
        System.out.println("---------------------");

        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

        System.out.println();
    }
}



// ===========================================================
// 2. COMPOSITION
// ===========================================================

/*
Example:
House contains Rooms.

Rooms are created inside the House.
If the House is destroyed, its Rooms are also destroyed.

Therefore, this is Composition.
*/

// -------------------------
// Room Class
// -------------------------
class Room {

    private String name;

    Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


// -------------------------
// House Class
// -------------------------
class House {

    private List<Room> rooms;

    House() {

        rooms = new ArrayList<>();

        rooms.add(new Room("Living Room"));
        rooms.add(new Room("Bedroom"));
        rooms.add(new Room("Kitchen"));
    }

    public void displayRooms() {

        System.out.println("House Rooms");
        System.out.println("---------------------");

        for (Room room : rooms) {
            System.out.println(room.getName());
        }

        System.out.println();
    }
}



// ===========================================================
// Main Class
// ===========================================================
public class assosiation_composition{
    public static void main(String[] args) {

        // ==========================
        // Aggregation Example
        // ==========================

        Employee emp1 = new Employee("Raj");
        Employee emp2 = new Employee("Rahul");
        Employee emp3 = new Employee("Bishnu");

        List<Employee> employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        Department department = new Department(employees);

        department.displayEmployees();


        // ==========================
        // Composition Example
        // ==========================

        House house = new House();

        house.displayRooms();
    }
}