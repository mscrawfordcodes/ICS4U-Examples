import java.util.Arrays;
import java.util.Scanner;

public class ChangingArrays {
  public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5};
    System.out.println(Arrays.toString(numbers));
   
    numbers = append(numbers);
    System.out.println(Arrays.toString(numbers));

    numbers = insertElement(numbers, 4); // can use a scanner to get a different index
    System.out.println(Arrays.toString(numbers));
    
    numbers = deleteElement(numbers, numbers.length-1);
    System.out.println(Arrays.toString(numbers));

  }


  /*
   * append takes an array of elements
   * since we are just adding a new element at the end of the old array
   * we make a new array one element bigger, copy all the elements from the old array in,
   * and then add the element at the last index of the new array
   */

  public static int[] append(int[] array) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a new element: ");
    int element = input.nextInt();

    int[] newArray = new int[array.length+1];

    // copy all the elements from the old array into the new array
    for(int index=0; index < array.length; index++) {
      newArray[index] = array[index];
    }

    // add the new element to the last index of new array
    newArray[newArray.length - 1] = element;

    return newArray;
  } 


  /*
   * insertElement method takes an array and an index to insert an element
   * we create a new array one element bigger to accommodate for the new element being inserted
   * copy all the old elements up to the index we want to insert
   * insert the new element at the specified index
   * then continue copying the remaining elements from the old array after the new element
   */

  public static int[] insertElement(int[] array, int index) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a new element: ");
    int element = input.nextInt();

    int[] newArray = new int[array.length + 1];

    //copy the elements from the old array into new array at the same index, stopping just before we need to add the new element at "index"
    for(int i=0; i <= index-1; i++) {
      newArray[i] = array[i];
    }

    newArray[index] = element; // add the new element at the specified index

    // continue copying the elements from the old array, but shift their indices by +1 in the new array
    for(int i=index; i < array.length; i++) {
      newArray[i+1] = array[i];
    }

    return newArray;
  }


  /*
   * deleteElement method takes an array, and an index to delete
   * removes the element by first making a new array 1 element shorter than the first array,
   * copying all the elements up to the index into the new array
   * and then shifting the elements in the old array backwards 
   */
  public static int[] deleteElement(int[] array, int index){
    int[] newArray = new int[array.length - 1];

    // make a copy of all the elements in the old array up to, but not including the specified index to delete
    for (int i=0; i < index; i++) {
      newArray[i] = array[i];
    }
    
    // shifts the elements in the old array backwards by 1 index to "delete" the element at the specified index
    for(int i=index; i < array.length-1; i++) {
      newArray[i] = array[i+1];
    }    

    return newArray;
     
  }

}