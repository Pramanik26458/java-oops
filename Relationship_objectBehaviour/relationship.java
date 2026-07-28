package Relationship_objectBehaviour;

import java.util.ArrayList;
import java.util.List;

/*
===========================================================
           Object Relationships in Java (OOP)

1. One-to-One Association
2. One-to-Many Association
3. Many-to-Many Association

Uncomment the required section to execute that example.
===========================================================
*/


// ===========================================================
// 1. ONE-TO-ONE ASSOCIATION
// ===========================================================

// class Passport {
//
//     private String passportNumber;
//
//     Passport(String passportNumber) {
//         this.passportNumber = passportNumber;
//     }
//
//     public String getPassportNumber() {
//         return passportNumber;
//     }
// }
//
// class Student {
//
//     private String name;
//     private Passport passport;
//
//     Student(String name, Passport passport) {
//         this.name = name;
//         this.passport = passport;
//     }
//
//     public void displayDetails() {
//         System.out.println("Student Name      : " + name);
//         System.out.println("Passport Number   : " + passport.getPassportNumber());
//     }
// }
//
// public class Relationship {
//
//     public static void main(String[] args) {
//
//         Passport passport = new Passport("56598563268AMSN658");
//
//         Student student = new Student("Raj", passport);
//
//         student.displayDetails();
//     }
// }



// ===========================================================
// 2. ONE-TO-MANY ASSOCIATION
// ===========================================================

// class Student {
//
//     private String name;
//     private String id;
//
//     Student(String name, String id) {
//         this.name = name;
//         this.id = id;
//     }
//
//     public String getName() {
//         return name;
//     }
//
//     public String getId() {
//         return id;
//     }
// }
//
// class College {
//
//     private String name;
//     private List<Student> students;
//
//     College(String name) {
//         this.name = name;
//         students = new ArrayList<>();
//     }
//
//     public void addStudent(Student student) {
//         students.add(student);
//     }
//
//     public void printAllStudents() {
//
//         System.out.println("College : " + name);
//         System.out.println("-------------------------");
//
//         for (Student student : students) {
//
//             System.out.println("Name : " + student.getName());
//             System.out.println("ID   : " + student.getId());
//             System.out.println();
//         }
//     }
// }
//
// public class Relationship {
//
//     public static void main(String[] args) {
//
//         Student student1 = new Student("Raj", "1548");
//         Student student2 = new Student("Vikram", "5184");
//
//         College college = new College("GEC");
//
//         college.addStudent(student1);
//         college.addStudent(student2);
//
//         college.printAllStudents();
//     }
// }



// ===========================================================
// 3. MANY-TO-MANY ASSOCIATION
// ===========================================================


// -------------------------
// Student Class
// -------------------------
class Student {

    private String name;
    private List<Course> courses;

    Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getName() {
        return name;
    }
}


// -------------------------
// Course Class
// -------------------------
class Course {

    private String name;
    private List<Student> students;

    Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAllStudents() {

        System.out.println("Course : " + name);
        System.out.println("-------------------------");

        for (Student student : students) {
            System.out.println("Student Name : " + student.getName());
        }

        System.out.println();
    }
}



// ===========================================================
// Main Class
// ===========================================================
public class relationship {

    public static void main(String[] args) {

        // Create Courses
        Course math = new Course("Mathematics");
        Course cs = new Course("Computer Science");

        // Create Students
        Student raj = new Student("Raj");
        Student rahul = new Student("Rahul");
        Student bishnu = new Student("Bishnu");

        // -------------------------
        // Student → Course
        // -------------------------
        raj.addCourse(cs);
        raj.addCourse(math);

        rahul.addCourse(math);

        // -------------------------
        // Course → Student
        // -------------------------
        cs.addStudent(bishnu);

        math.addStudent(bishnu);

        // -------------------------
        // Display Students
        // -------------------------
        math.printAllStudents();

        cs.printAllStudents();
    }
}