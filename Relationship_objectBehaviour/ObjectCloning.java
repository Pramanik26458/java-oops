// // ===========================
// // SHALLOW COPY
// // ===========================

// class Passport implements Cloneable {

//     String passportNumber;

//     Passport(String passportNumber) {
//         this.passportNumber = passportNumber;
//     }

//     @Override
//     protected Passport clone() throws CloneNotSupportedException {
//         return (Passport) super.clone();
//     }
// }

// class Student implements Cloneable {

//     String name;
//     Passport passport;

//     Student(String name, Passport passport) {
//         this.name = name;
//         this.passport = passport;
//     }

//     // Shallow Copy
//     @Override
//     protected Student clone() throws CloneNotSupportedException {
//         return (Student) super.clone();
//     }
// }

// public class ObjectCloning {

//     public static void main(String[] args) throws CloneNotSupportedException {

//         Passport passport = new Passport("56598563268AMSN658");

//         Student student = new Student("Raj", passport);

//         Student cloneStudent = student.clone();

//         System.out.println("===== BEFORE MODIFICATION =====");
//         System.out.println(student.name);
//         System.out.println(student.passport.passportNumber);
//         System.out.println(cloneStudent.name);
//         System.out.println(cloneStudent.passport.passportNumber);

//         cloneStudent.name = "Rahul";
//         cloneStudent.passport.passportNumber = "6559DWS8C76";

//         System.out.println("\n===== AFTER MODIFICATION =====");
//         System.out.println(student.name);
//         System.out.println(student.passport.passportNumber);
//         System.out.println(cloneStudent.name);
//         System.out.println(cloneStudent.passport.passportNumber);
//     }
// }




// ===========================
// DEEP COPY
// ===========================

class Passport implements Cloneable {

    String passportNumber;

    Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    protected Passport clone() throws CloneNotSupportedException {
        return (Passport) super.clone();
    }
}

class Student implements Cloneable {

    String name;
    Passport passport;

    Student(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    // Deep Copy
    @Override
    protected Student clone() throws CloneNotSupportedException {

        Student clonedStudent = (Student) super.clone();

        // Clone the Passport object separately
        clonedStudent.passport = passport.clone();

        return clonedStudent;
    }
}

public class ObjectCloning {

    public static void main(String[] args) throws CloneNotSupportedException {

        Passport passport = new Passport("56598563268AMSN658");

        Student student = new Student("Raj", passport);

        Student cloneStudent = student.clone();

        System.out.println("===== BEFORE MODIFICATION =====");
        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        System.out.println(cloneStudent.name);
        System.out.println(cloneStudent.passport.passportNumber);

        cloneStudent.name = "Rahul";
        cloneStudent.passport.passportNumber = "6559DWS8C76";

        System.out.println("\n===== AFTER MODIFICATION =====");
        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        System.out.println(cloneStudent.name);
        System.out.println(cloneStudent.passport.passportNumber);
    }
}