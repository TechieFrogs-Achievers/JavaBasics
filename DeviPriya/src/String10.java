import java.util.Random;
public class String10 {
    
    public static void main( String args[] ) {
        int min = 50;
        int max = 100;
        //Generate random double value from 50 to 100 
        System.out.println("Random value in double from "+min+" to "+max+ ":");
        double random_double = Math.random() * (max - min + 1) + min; 
        System.out.println(random_double);
          
        //Generate random int value from 50 to 100 
        System.out.println("Random value in int from "+min+" to "+max+ ":");
        int random_int = (int)(Math.random() * (max - min + 1) + min);
        System.out.println(random_int);
      }
    
}
