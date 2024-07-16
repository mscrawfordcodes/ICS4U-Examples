import java.util.Scanner; // need this line every time we want to work with user input

public class ScannerExample {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        // basic code to create a Scanner - can use any "name", it does not have to be "userInput" 
        Scanner userInput = new Scanner(System.in);
    
        System.out.print("Enter your name to get started: "); // a print statement used to prompt what to type, notice we use print, not println
        
        String name = userInput.nextLine(); // reads the input the user types, INCLUDING when they hit the enter key. So their input is actually what they type plus the newline character \n e.g. "Ms. Crawford/n"
    
        System.out.print("Enter 3 numbers: ");
        int num1 = userInput.nextInt();
        int num2 = userInput.nextInt();
        int num3 = userInput.nextInt();
    
        userInput.nextLine(); // eat the new line character from entering in num3
    
        System.out.print("Enter another string: ");
        String secondLine = userInput.nextLine();
    
        userInput.close(); // ends the use of the scanner, and makes sure it doesn't get stuck waiting for more user input
    
    
        // output all the collected information
        System.out.println("Your 3 numbers were "+num1+","+num2+","+num3); // print out the 3 numbers inputted
        System.out.println("Welcome, "+name+"!"); // make use of the user input
        System.out.println("Print out the secondLine variable: "+secondLine);
      }
}
