import java.util.Scanner;

public class StaticMethodsExample {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the base of the triangle: ");
    double base = input.nextDouble(); 

    System.out.print("\nEnter the height of the triangle: ");
    double height = input.nextDouble();
    
    input.close();

    double area = triangleArea(base, height); // call the triangleArea method to calculate the area

    System.out.printf("\nThe area of the triangle is %.2f", area);
    
  }

  /* This is an example of a Static Method
   * We can call the method from within our main method to do a specific task
   * In: base and height of a triangle as doubles
   * Out: area of the triangle as a double
   */
  public static double triangleArea(double base, double height) {
    double area;
    area = base*height/2;
    return area;
  }
}
