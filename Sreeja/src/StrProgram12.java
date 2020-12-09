import java.util.*;
public class StrProgram12 
{
     public static void main(String[] args) 
     {
       
       
        Scanner sc = new Scanner(System.in);    //creating scanner class object     

        
        System.out.println("Enter a sentence");
         String sr = sc.nextLine();             //read the string from the user

         System.out.println(sr);

         sr = sr.replace(' ','s');          //using replace()method to replace space with character
         System.out.println("After replacing"+sr);      //print the result

         sc.close();
         

         
         
    }
    
}
