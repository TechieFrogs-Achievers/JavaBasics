import java.util.*;
public class StrProgram17 
{
     public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);    //create scanner class object
        
        System.out.println("Enter a string : ");
        
        String str = sc.nextLine();         //read the string from user 
        
        char string[] = str.toCharArray();      //coverting string to characters
        
        //loop to check duplicate characters
        
        for( int i = 0 ; i < str.length() ; i++ )
        {
            int count = 1;
            for(int j = 1 ; i < str.length() ; j++)
            {
            if(string[i] == string[j])
            {
                count++ ;
                string[j] = '0' ;       //replace duplicate elements with 0
            }
            }
        
        if(count > 1 && string[i] != '0')
        {
        System.out.println(string[i]);
        }
        sc.close();
    }
}
}
