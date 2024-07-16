public class Car extends Vehicle {

    int wheels = 4;
    int year;

    public Car(String make, String model, int year) {
        super(make, model);
        this.year = year;
    }    


    public static void main(String[] args) {
        Car beetle = new Car("Volkswagen","Beetle",2005);

        System.out.println(beetle.make+" "+beetle.model);
        System.out.println(beetle.wheels);
        beetle.honk();

    }

    public void honk() {
        System.out.println("HOOOOOOOOOOOOOOONKKKKKKKK");
    }


}