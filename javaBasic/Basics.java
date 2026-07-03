package javaBasic;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello world Basak");

        String s1 = "Hello";
        char[] arr = { 'W', 'o', 'r', 'l', 'd' };
        String s2 = new String(arr); // char array to string

        System.out.println(s1 + " " + s2); // Concatenate: Hello World
        System.out.println(s1.charAt(1)); // Char at index 1: 'e'
        System.out.println(s1.length()); // Length: 5
        System.out.println(s1.substring(0, 2)); // Substring: "He"
        System.out.println(s1.equals("Hello")); // Check content equality: true
        System.out.println(s1.equals(s2));

        /* Input - output */
        int num = sc.nextInt();
        System.out.println(num);

        // sc.close();

        /* Type Casting */

        int x = 10;
        double y = x;
        System.out.println(y);

        double a = 10;
        int b = (int) a;
        System.out.println(b);

        /* Final keyword */

        // final int c=10;
        // c+=15;
        // System.out.println(c);

        /*---------------Arrays-----------------------*/
        int[] arr1 = new int[5];
        arr1[0] = 0;
        arr1[1] = 1;
        arr1[2] = 2;
        arr1[3] = 3;
        arr1[4] = 5;
        System.out.println(arr1[4]);
        System.out.println(arr1.length);

        int[] arr2 = { 10, 4, 5, 8, 7 };
        System.out.println(arr2[0]);
        System.out.println(arr2.length);

        /* -------- 2D Arrays -------- */

        int[][] arr2D = { { 10, 2 }, { 5, 4, 8 }, { 7, 5, 1 } };

        System.out.println(arr2D[1][2]); // 8

        /*------------- Conditional Statement ------------------*/

        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Teen");
        }

        /* Grading system */

        int marks = sc.nextInt();
        if (marks > 90) {
            System.out.println("A");
        } else if (marks > 80) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        /*--------------switch case-----------*/
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid");
        }

        /* --------LOOPS---------- */

        // for loop

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // do while loop

        int j = 0;
        do {
            System.out.println(j); // Runs at least once
            j++;
        } while (j < 5);

/*Exception Handling */
        try{
            int num1=10;
            int num2=0;
            int res=num1/num2;
            System.out.println(res);
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block executed");
        }


        sc.close();
    }
}