package Strings;

public class DuplicateCharecters {
    public static void main(String[] ij){

      String str = "neeraja";
      int count = 0;
      //changing string to charecters
      char[] c = str.toCharArray();
      System.out.println("Duplicate Characters are:");

      //iterating each and every charecter in an array 
      for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j < str.length(); j++) {
      if (c[i] == c[j]) {
      System.out.println(c[j]);
      count++;
      break;
      
    }
   }
  }
 

    }
    
}
