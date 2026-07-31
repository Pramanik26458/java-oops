public class SOLIDDemo {

    public static void main(String[] args) {

        // ============================
        // S - Single Responsibility Principle
        // ============================

        System.out.println("===== S : Single Responsibility Principle =====");

        Report report = new Report("Annual Sales Report");

        ReportPrinter printer = new ReportPrinter();
        printer.print(report);

        ReportSaver saver = new ReportSaver();
        saver.save(report);

        // ============================
        // O - Open/Closed Principle
        // ============================

        System.out.println("\n===== O : Open/Closed Principle =====");

        PaymentService paymentService = new PaymentService();

        paymentService.makePayment(new UpiPayment(), 1000);
        paymentService.makePayment(new CardPayment(), 2500);

        // Add a new payment method without modifying PaymentService
        paymentService.makePayment(new CashPayment(), 500);

        // ============================
        // L - Liskov Substitution Principle
        // ============================

        System.out.println("\n===== L : Liskov Substitution Principle =====");

        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        sparrow.move();
        penguin.move();

        // ============================
        // I - Interface Segregation Principle
        // ============================

        System.out.println("\n===== I : Interface Segregation Principle =====");

        Human human = new Human();
        human.work();
        human.eat();

        Robot robot = new Robot();
        robot.work();

        // ============================
        // D - Dependency Inversion Principle
        // ============================

        System.out.println("\n===== D : Dependency Inversion Principle =====");

        Computer computer1 = new Computer(new Keyboard());
        computer1.start();

        Computer computer2 = new Computer(new Mouse());
        computer2.start();
    }
}

/*=====================================================
    S - Single Responsibility Principle (SRP)
=====================================================*/

class Report {

    private String content;

    public Report(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class ReportPrinter {

    public void print(Report report) {
        System.out.println("Printing Report : " + report.getContent());
    }
}

class ReportSaver {

    public void save(Report report) {
        System.out.println("Saving Report : " + report.getContent());
    }
}

/*=====================================================
    O - Open/Closed Principle (OCP)
=====================================================*/

interface PaymentMethod {
    void pay(double amount);
}

class UpiPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}

// New payment method added without modifying PaymentService
class CashPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash");
    }
}

class PaymentService {

    public void makePayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}

/*=====================================================
    L - Liskov Substitution Principle (LSP)
=====================================================*/

class Bird {

    public void move() {
        System.out.println("Bird is moving");
    }
}

class Sparrow extends Bird {

    @Override
    public void move() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin extends Bird {

    @Override
    public void move() {
        System.out.println("Penguin is swimming");
    }
}

/*=====================================================
    I - Interface Segregation Principle (ISP)
=====================================================*/

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {

    @Override
    public void work() {
        System.out.println("Human is working");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }
}

class Robot implements Workable {

    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}

/*=====================================================
    D - Dependency Inversion Principle (DIP)
=====================================================*/

interface InputDevice {
    void input();
}

class Keyboard implements InputDevice {

    @Override
    public void input() {
        System.out.println("Typing using Keyboard");
    }
}

class Mouse implements InputDevice {

    @Override
    public void input() {
        System.out.println("Clicking using Mouse");
    }
}

class Computer {

    private InputDevice device;

    public Computer(InputDevice device) {
        this.device = device;
    }

    public void start() {
        System.out.print("Computer Started -> ");
        device.input();
    }
}