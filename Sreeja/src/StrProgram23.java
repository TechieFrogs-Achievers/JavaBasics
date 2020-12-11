import java.util.*;
public class StrProgram23
 {
    public static void main(String[] args) 
    {
       
       Scanner sc = new Scanner(System.in);     //create scanner object and read the value from console
        System.out.println("enter a sentence");
        String str = sc.nextLine();         //read the value 

        for(int i=0;i<str.length();i++)         //for loop to print the individual characters 
        {
            System.out.print(str.charAt(i)+" ");    //print the characters
        }
        sc.close();

        

    }
}
