public class MultidimensionalArrays {
    public static void main(String[] args) {

        int[][] numbers = {{1, 3, 5, 4}, 
                           {9, 11, 13, 14}, 
                           {17, 19, 21, 24}
                          };
    
        System.out.println(numbers[2][1]);
        System.out.println(numbers.length); // number of rows .. and number of smaller arrays stored
    
        System.out.println(numbers[0].length); //number of columns
    
        // print out all elements of the array
        for(int i=0; i < numbers.length; i++){ // loops over the rows
          System.out.println("\nPrinting out row "+i);
          for(int j=0; j < numbers[0].length; j++) { // loops over the columns, or the values in each row
            System.out.print(numbers[i][j]+" ");
          }
        }
    }//end main method     
}//end class
