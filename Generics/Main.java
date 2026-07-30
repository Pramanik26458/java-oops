import java.util.*;

// Generic Class
class ExampleGenerics<T> {

    private List<T> list = new ArrayList<>();

    // Generic Method
    public void add(T val) {
        list.add(val);
    }

    public void removeLast() {
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        list.remove(list.size() - 1);
    }

    public T getElement(int index) {
        return list.get(index);
    }

    public void print() {
        for (T el : list) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}

// Bounded Type Parameter
class Calculator<T extends Number> {

    public double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}

public class Main {

    /*
     * Generic Method
     *
     * public static <T> void printArray(T[] arr) {
     *     for (T val : arr) {
     *         System.out.println(val);
     *     }
     * }
     */

    // Upper-Bounded Wildcard
    public static void printArray(List<? extends Number> ls) {
        for (Number val : ls) {
            System.out.println(val);
        }
    }

    // Lower-Bounded Wildcard
    public static void writeArray(List<? super Integer> ls) {
        ls.add(10);

        System.out.println("Lower Bounded: " + ls.get(0));

        // Integer x = ls.get(0); ❌ Not allowed
        // Read access is only guaranteed as Object.
    }

    public static void main(String[] args) {

        /*
         * Generic Class Example
         *
         * ExampleGenerics<Integer> obj = new ExampleGenerics<>();
         * obj.add(45);
         * obj.add(20);
         * obj.add(21);
         * obj.add(22);
         * obj.add(23);
         *
         * System.out.println("First Element: " + obj.getElement(0));
         * obj.removeLast();
         *
         * System.out.print("Final List: ");
         * obj.print();
         */

        // Bounded Type Parameter
        Calculator<Integer> intCalc = new Calculator<>();
        System.out.println(intCalc.add(7, 2));

        Calculator<Double> doubleCalc = new Calculator<>();
        System.out.println(doubleCalc.add(7.8, 2.2));

        // Upper-Bounded Wildcard
        List<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(1);

        printArray(ls);

        // Lower-Bounded Wildcard
        writeArray(ls);

        // Raw Type
        List rawList = new ArrayList();

        rawList.add(10);
        rawList.add(10.9);
        rawList.add("basu");

        for (Object obj : rawList) {
            System.out.print(obj + " ");
        }
    }
}