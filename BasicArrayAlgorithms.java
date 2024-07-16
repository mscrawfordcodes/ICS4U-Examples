import java.util.Arrays;
import java.util.Scanner;

public class BasicArrayAlgorithms {
    public static void main(String[] args) {
        int[] array;
        Scanner input = new Scanner(System.in);

        // Determining array length
        System.out.print("How many numbers to enter? ");
        int size = input.nextInt();

        array = new int[size];

        // Adding numbers to the array - this loop will stop once we've added the amount of numbers specified by the user
        for (int index = 0; index < array.length; index++) {
            System.out.print("Enter a number: ");
            array[index] = input.nextInt();
        }
        input.close();


        // finding the maximum value

        int[] array2 = {-20, 19, 1, 5, -1, 27, 19, 5};
        int max;
        // initialize the current maximum
        max = array2[0];

        for (int index=0; index < array2.length; index++){ 
            if (array2[index] > max ) {
                max = array2[index];        
                // if it is the largest so far, change max
            } // end if

        } // end loop

        System.out.println("The maxium value in the array is "+max);


        // printing an array

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        // or loop over each element in the array and print it out

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    } // end main method
} // end class
