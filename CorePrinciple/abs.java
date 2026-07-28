
abstract class Car {
    abstract public void start();

    public void noise() {
        System.out.println("noise......");

    }
}

interface CarInterface{
    public void start();

    // default and static
    default void noise(){
        System.out.println("Noise...");
    }

    static void noOfWheels(){
        System.out.println("wheels: 4");
    }

}

class ManualCar extends Car {
    public void start() {
        CarInterface.noOfWheels();
        System.out.println("ManualCar is starting...");
    }
}

class AutomateCar extends Car {
    public void start() {
        System.out.println("AutomateCar is starting...");
    }
}

public class abs {
    public static void main(String[] args) {
        Car manualCar = new ManualCar();
        manualCar.start();
        manualCar.noise();

        System.out.println();

        Car automateCar = new AutomateCar();
        automateCar.start();
        automateCar.noise();
        CarInterface.noOfWheels();
    }
}
