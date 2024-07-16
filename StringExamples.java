public class StringExamples {
    public static void main(String[] args) {
        // Example 1
        String str = "Knowledge is ";
        String s;
        s = str;

        str = "Knowledge is Power";

        System.out.println(s);
        System.out.println(str);

        // Example 2
        String str2 = "Knowledge is ";
        String s2 = str2;

        System.out.println(str2);
        System.out.println(s2);


        // Example 3
        String word1 = "testing";
        String word2 = "strings";

        word1.concat(word2);

        System.out.println(word1);

        // Example 4
        String first = "Red " ;
        String last  = "Rose" ;
        String fullName  = first.concat(last);

        System.out.println(fullName);


        // Example 5... does this "work"?
        String name = "Rose";
        String newName = "Rose";
        
        if (name == newName) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    } //end main method
} //end class
