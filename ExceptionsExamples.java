public class ExceptionsExamples {
    public static void main(String[] args) {
      System.out.println("Hello world!");
  
      int numerator = 5;
      int denominator = 0;
  
      try {
        int divide = numerator / denominator;
        System.out.println(divide);
      }
      catch (ArithmeticException e) {
        System.out.println(e);
        System.out.println("So sorry :(");
      }
  
      System.out.println("After the try catch block");
  
      String greeting = "hello";
  
      try{
        System.out.println(greeting.charAt(5));
      }
      catch(StringIndexOutOfBoundsException obj){
        System.out.println(obj.getMessage());
      } 
      
  
    }
  }