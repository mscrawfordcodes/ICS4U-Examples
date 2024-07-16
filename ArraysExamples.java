public class ArraysExamples {
    public static void main(String[] args) {
        int[] numbers = new int[5];
    
        for(int index = 0; index < numbers.length; index++) {
          numbers[index] = index+1;
        }
    
        for(int i = 0; i < numbers.length; i++) {
          System.out.println(numbers[i]);
        }
    
        System.out.println(numbers);
    
    
        String[] myStrings = {"test", "test1","test2"};
    
        System.out.println(myStrings.length);
    
      }
}
