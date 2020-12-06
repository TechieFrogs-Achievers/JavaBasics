package StringsExercise;

public class Example2p 
{
    public static void main(String args[])
    {
        String[] words = { "eswari", "jemeema", "shirin", "bindhu", "satya", "sasi" };
      int n = 6;
      System.out.println("The original order of the words is: ");
      for(int i = 0; i < n; i++) {
         System.out.println(words[i]);
      }
      for(int i = 0; i < n-1; ++i) {
         for (int j = i + 1; j < n; ++j) {
            if (words[i].compareTo(words[j]) > 0) {
               String temp = words[i];
               words[i] = words[j];
               words[j] = temp;
            }
         }
      }
      System.out.println("\nThe lexicographical order of the words is: ");
      for(int i = 0; i < n; i++) {
         System.out.println(words[i]);
      }
   }
}
    

