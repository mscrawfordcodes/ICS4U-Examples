import java.lang.Math;

public class PrintfExample {
    public static void main (String[] args) {
        System.out.printf("PI =%8.2f%n", Math.PI); // 8 places, 2 for precision
        System.out.printf("PI =%8.4f%n", Math.PI); // 8 places, 4 for precision
        System.out.printf("PI =%8.6f%n", Math.PI); // 8 places, 6 for precision
        System.out.printf("PI =%f%n", Math.PI);    // default
  
      
        double first = 12345.6789;    
        double second = -45.97; 
        System.out.printf("\nfirst = %10.3f;  second = %7.3f;  sum = %f", first, second, first+second);
    
        
        int integer = 27;
    
        System.out.printf("\nExample of printing an integer: %d%n",integer);
  
  }
}
