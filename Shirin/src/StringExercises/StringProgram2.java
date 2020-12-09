package StringExercises;
import java.util.*;

public class StringProgram2 
{
    public static void main(String[] args) 
    {   
        
        System.out.println("Enter the length");//length
        Scanner sc = new Scanner(System.in);//scaneer class
        int  Word_length = sc.nextInt();//length for input
        System.out.println(" enter the name");
        String word[] = new String[Word_length];// Initiallizing array for storing the data
        for( int i = 0; i < Word_length; i++)
        {
            word[i] = sc.next();
        }
        for(int i = 0; i<Word_length-1;i++)// loop for check first word
        {
            for(int j = i;j<Word_length;j++)// loop for checking next word
            {
                if (word[i].compareTo(word[j])>0)
                {
                    String temp = word[i];// sorting 
                    word[i]= word[j];
                    word[j] = temp;

                }

            }
        }
        for (int i =0; i< Word_length;i++)// printing the data 
        {
            System.out.println(word[i]);
        }
        sc.close();// closing scanner class

        
        
        

        
    }
    
}
