import java.util.*;

/*
=========================================
Java Inner Classes
1. Static Nested Class
2. Member Inner Class (Non-Static)
3. Local Inner Class
4. Anonymous Inner Class
=========================================
*/

class OuterClass {

    static int staticVar = 100;
    int instanceVar = 42;

    // ==========================
    // 1. Static Nested Class
    // ==========================
    static class StaticNestedClass {

        void display() {
            System.out.println("Static Variable : " + staticVar);
        }
    }

    // ==========================
    // 2. Member Inner Class
    // ==========================
    class MemberInnerClass {

        void display() {
            System.out.println("Instance Variable : " + instanceVar);
        }
    }

    // ==========================
    // 3. Local Inner Class
    // ==========================
    void outerMethod() {

        int localVar = 10;

        class LocalInnerClass {

            int x = 100;

            void display() {
                System.out.println("Local Variable : " + localVar);
                System.out.println("Inner Variable : " + x);
            }
        }

        LocalInnerClass obj = new LocalInnerClass();
        obj.display();
    }
}

// ==========================
// 4. Anonymous Inner Class
// ==========================
abstract class Greeting {

    abstract void sayHello();
}

public class innerClass {

    public static void main(String[] args) {

        // =====================================
        // 1. Static Nested Class
        // =====================================
        System.out.println("===== Static Nested Class =====");

        OuterClass.StaticNestedClass staticObj =
                new OuterClass.StaticNestedClass();

        staticObj.display();

        // =====================================
        // 2. Member Inner Class
        // =====================================
        System.out.println("\n===== Member Inner Class =====");

        OuterClass outer = new OuterClass();

        OuterClass.MemberInnerClass memberObj =
                outer.new MemberInnerClass();

        memberObj.display();

        // =====================================
        // 3. Local Inner Class
        // =====================================
        System.out.println("\n===== Local Inner Class =====");

        outer.outerMethod();

        // =====================================
        // 4. Anonymous Inner Class
        // =====================================
        System.out.println("\n===== Anonymous Inner Class =====");

        Greeting greeting = new Greeting() {

            @Override
            void sayHello() {
                System.out.println("Hello, World!");
            }
        };

        greeting.sayHello();
    }
}