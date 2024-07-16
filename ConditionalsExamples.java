import java.util.Scanner;

public class ConditionalsExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter the weight of the luggage in lbs: ");
        int weight = input.nextInt();
        input.close();
    
        if (weight <= 20) {
          System.out.println("Your baggage meets weight requirements!");
        }
        else if (weight > 21 && weight <= 50) {
          System.out.println("A surcharge for baggage will apply!");
        }
        else {
          System.out.println("Your baggage is too heavy!");
        }
      } // end of main method
} // end of class
