import java.util.*;
public class StrProgram18 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);        //creating scanner class object
        
        System.out.println("Enter any sentence : ");
        
        String str = sc.nextLine();   // read the sentence from user and store in str
        
        int count;
        
        str = str.toLowerCase();  // converting sentence to small letters
        
        String words[] = str.split(" ");   // splitting the sentence into words
        
        System.out.println("The Duplicate words in the sentence are : ");
        
        //loop to check the duplicate words

        for(int i = 0; i < words.length ; i++ )
        {
            count = 1 ;
            for( int j = i+1 ; j < words.length; j++)
            {
                if(words[i].equals(words[j]))
                {
                    count++ ;
                    words[j] = "0" ;  // replacing the duplicate words with 0
                }
            }
            
            //print the the duplicate words

            if(count > 1 && words[i] != "0")
            System.out.println(words[i]);
        }
        sc.close(); 
    }
}
