public class StringMethodsExamples {
    public static void main(String[] args) {
      System.out.println("Hello world!");
  
      String stringA = "  Hello  ";
  
      char letter = 'L';
  
      System.out.println(stringA.length());
  
      String stringB = "Hello world!";
  
      System.out.println(stringB.length());
  
      for(int i =0; i < stringB.length(); i++) {
        if(stringB.charAt(i) == ' ') {
          System.out.println("we found a space at index "+i);
        }
      }
  
      System.out.println(stringB.substring(6));
  
     // System.out.println(stringB.substring(0,12));
  
      String stars = "*****" ;
  int i = 1;
  while (i <= stars.length())
  {
    System.out.println( stars.substring(0,i));
    i = i+1;
    System.out.println(i);
  }
  
      String snake = "Rattlesnake";		
  snake.substring(0,6);	
  System.out.println(snake.substring(6,6));		
  
  
  //snake.substring(5,3);
  //snake.substring(5,12);
  
  
      
    }
  }