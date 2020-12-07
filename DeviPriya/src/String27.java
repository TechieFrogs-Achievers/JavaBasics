public class String27 {
    static void splitString(String str1, int n) {
        int str_size = str1.length();
        int part_size;
        if (str_size % n != 0) {
         System.out.println("The size of the given string is not divisible by " + n);
         return;
        } else {
         System.out.println("The given string is: " + str1);
         System.out.println("The string divided into " + n + " parts and they are: ");
         part_size = str_size / n;
         for (int i = 0; i < str_size; i++) {
          if (i % part_size == 0) System.out.println();
          System.out.print(str1.charAt(i));
         }
        }
       }
       public static void main(String[] args) {
        String str1 = "abcdefghijklmnopqrstuvwxy";
        int split_number = 5;
        splitString(str1, split_number);
       }
    
}
