package introduction_oops.classObjectPractice;

import java.util.Scanner;

public class Student {
   private String name;
   public int rollNo;
    
    public void setDetaills(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    public void ShowDetaills(){
        System.out.println("Name : "+this.name);
        System.out.println("Roll Number : "+this.rollNo);
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Student std=new Student();
        String name=sc.nextLine();
        int rollNo=sc.nextInt();

        std.setDetaills(name, rollNo);

         std.ShowDetaills();
    }
}
