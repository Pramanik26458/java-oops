package CorePrinciple;

/**
 * abstraction-interface

 */

interface CarInterface {
    public void start();

    public void NoOfGears();

    default void airbags() {
        System.out.println("Car has 5 airBags");
    }

    static void printVachileType(){
        System.out.println("it is a car");
    }
}

interface sunRoof{
    public void sunRoof();
}


class ManualCar implements CarInterface,sunRoof{
    public void start(){
        airbags();
        System.out.println("Manul car is starting...");
    }
    public void NoOfGears(){
        System.out.println("Manul car has 6 gears...");
    }
    public void sunRoof(){
        System.out.println("this car has normal sunRoof...");
    }
}

public class ingterface {
    public static void main(String[] args) {
        ManualCar manualCar=new ManualCar();
        manualCar.start();
        manualCar.NoOfGears();
        manualCar.sunRoof();
    }
}
