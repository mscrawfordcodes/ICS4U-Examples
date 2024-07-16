import java.lang.Math;
public class MethodOverloadingExample {
  public static void main(String[] args) {
    System.out.println(max(3,7));
    System.out.println(max(2.43,9.123));
    System.out.println(Math.max(4,7));

  }

  public static int max(int num1, int num2) {
    if (num1 > num2) {
      return num1;
    }
    return num2;
  }

  // note the exact same method name as before, but the data type of the parameters and return type distinguishes the methods
  public static double max(double num1, double num2) {
    if (num1 > num2) {
      return num1;
    }
    return num2;
  }
}