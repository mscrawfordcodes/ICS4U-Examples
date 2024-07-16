public class StringMethodsExamples2 {
    public static void main(String[] args) {
      String phrase = "The quick brown fox jumps over the lazy dog";
  
      int findQ = phrase.indexOf("brown");
  
      System.out.println(findQ);
  
      String line = "ant bat cat dog eel fox gnat hen ant";
      String search = "ant";
      
      int position = line.indexOf(search); // find occurance of first ant
  
      String rest = line.substring(position+1); // search the rest of the string
      int position2 = rest.indexOf(search); //find the second occurance from the rest of the string
      
      System.out.println(position);
      System.out.println(position2);
  
  
  
      String example = "The sea is calm tonight.";
      String tail = example.substring(example.indexOf("a"));
  
  
      System.out.println(tail);
  
  
      String myStr = "loHel lo";
      System.out.println(myStr.replace("lo",""));
  
      
    }
  }