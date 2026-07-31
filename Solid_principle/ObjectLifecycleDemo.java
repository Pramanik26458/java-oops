class Student {

    private String name;

    // Constructor (Initialization)
    public Student(String name) {
        this.name = name;
        System.out.println("1. Constructor Called");
        System.out.println("Object Created for: " + name);
    }

    // Method (Object Usage)
    public void study() {
        System.out.println("2. " + name + " is studying Java.");
    }

    // Deprecated - Only for demonstration
    @Override
    protected void finalize() throws Throwable {
        System.out.println("4. Garbage Collector destroyed object of " + name);
    }
}

public class ObjectLifecycleDemo {

    public static void main(String[] args) {

        System.out.println("Program Started\n");

        // ----------------------------
        // Object Creation
        // ----------------------------
        Student student = new Student("Basak");

        System.out.println();

        // ----------------------------
        // Object Usage
        // ----------------------------
        student.study();

        System.out.println();

        // ----------------------------
        // Object becomes eligible for GC
        // ----------------------------
        System.out.println("3. Removing reference...");

        student = null;

        // Request Garbage Collection
        System.gc();

        // Give GC some time (only for demo)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nProgram Ended");
    }
}