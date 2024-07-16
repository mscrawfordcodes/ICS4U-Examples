public class Motorcycle extends Vehicle {
    int wheels = 2;

    public Motorcycle(String make, String model) {
        super(make, model);
    }  

    public static void main(String[] args) {
        Motorcycle harley = new Motorcycle("Harley Davidson","a very cool one");

        System.out.println(harley.make+" "+harley.model);
        System.out.println(harley.wheels);
        harley.honk();

    }

    public void honk() {
        System.out.println("Meep meep");
    }
}