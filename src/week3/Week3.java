package week3;

public class Week3 {

    public static void main(String[] args) {
        Car car1 = new Car("38 ABC 123", "model1", 30.00, 50.00);
        System.out.println("Car 1 (" + car1.getModel()+")");
        car1.drive(120);
        car1.refuel(40.00);
        car1.checkStatus();
        System.out.println("--------------------------------");
        Car car2 = new Car("38 AB 123", "model2", 5.00, 50.00);
        System.out.println("Car 2 (" + car2.getModel()+")");
        car2.drive(200);
        car2.refuel(20.00);
        car2.checkStatus();
        System.out.println("--------------------------------");
        Car car3 = new Car("38 A 123", "model3", 5.00, 70.00);
        System.out.println("Car 3 (" + car3.getModel()+")");
        car3.drive(500);
        car3.refuel(1.00);
        car3.checkStatus();
        System.out.println("--------------------------------");
    }

}
