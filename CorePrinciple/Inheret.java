package CorePrinciple;

// class School{
//     private String name;
//     School(){
//         name="K.G.B.V. Nimdih";

//     }

//     void printSchoolName(){
//         System.out.println("School name: "+name);
//     }

//     void menagenmtOfSchool(){
//         System.out.println("\nSchool: the management of our School is Very Very Good");
//     }
// }

// class Student extends School{
//     private String name;

//     Student (String name){
//         this.name=name;
//     }

//     void printStudentName(){
//         System.out.println("Student Name: "+name);
//     }

//     @Override
//     void  menagenmtOfSchool(){
//         super.menagenmtOfSchool();
//         System.out.println("Students: Management is Not Good Heere... 😕");
//     }
// }

// class Parent extends Student{
//     private String name;

//     Parent(String name,String studentName){
//         super(studentName);
//         this.name=name;
//     }

//     void printParentName(){
//         System.out.println("Father's Name: "+name);
//     }
// }

// class Teacher extends School{
//     private String name;
//     private String subject;
    
//     Teacher(String name,String subject){
//         this.name=name;
//         this.subject=subject;
//     }

//     void printTeacher(){
//         System.out.println("Class Teacher: "+name);
//         // System.out.println("Subject: "+subject);
//     }
// }
// public class Inheret{
//     public static void main(String[] args) {
        
//         Parent pa=new Parent("Raj", "Laxmi");
//         Teacher tch=new Teacher("Striver", "DSA");
//         tch.printSchoolName();
//         pa.printStudentName();
//         pa.printParentName();
//         tch.printTeacher();
//         pa.menagenmtOfSchool();


//     }
// }


class Product{
    private String name;
    private String category;
    private double price;

    Product(String name,String category,double price){
        this.name=name;
        this.category=category;
        this.price=price;
    }

    void displayDetails(){
        System.out.println("name: "+name);
        System.out.println("category: "+category);
        System.out.println("price: "+price);
    }
}

class Electronics extends Product{
    private int warrantyPeriodYears;
    private String brand;

    Electronics(int warrantyPeriodYears,String brand,String name,String category,double price){
        super(name, "Electronics", price);
        this.warrantyPeriodYears=warrantyPeriodYears;
        this.brand=brand;
       
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("warranty: "+warrantyPeriodYears);
        System.out.println("Brand: " +brand+"\n");

    }
}

class Tshirt extends Product{
    private String size;
    private String color;

    Tshirt(String size,String color,String name,String category,double price){
        super(name, "T-shirt", price);
        this.size=size;
        this.color=color;
       
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Size: "+size);
        System.out.println("Color: " +color);

    }
}

public class Inheret{
    public static void main(String[] args) {
    Electronics elc=new Electronics(5, "Tata", "Refrigetor", "electronics", 2548);
    Tshirt ts=new Tshirt("M", "black", "polo-ts", "Tshirt", 230.54);
    elc.displayDetails();
        ts.displayDetails();
    }
}


