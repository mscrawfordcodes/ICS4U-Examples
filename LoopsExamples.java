public class LoopsExamples {
  public static void main(String[] args) {
    //System.out.println("Hello world!");


    double product = 1.5;

    for (int count=1; count <=5; count++) {
      product = product*count;
      System.out.print(count + " ");
    }
    System.out.println("\n"+product);


    System.out.println("------------------");

    int first = 43;
    int second = 10;

    System.out.println("While Loops");
    while (first > second) {
      System.out.println(first + " "+second);
      first -= 5;
      second +=6;
      System.out.println("first "+first);
      System.out.println("second "+second);
    }
    System.out.println("End of program");
  }
}