public class Vehicle {
    String make;
    String model;
    int wheels;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void honk() {
        System.out.println("Time to honk the horn");
    }

}
