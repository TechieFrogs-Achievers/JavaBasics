import java.util.*;
public class StrProgram16 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);        //create scanner class object
        
        
        System.out.println("Enter a sentence");

        StringBuffer sb = new StringBuffer(sc.nextLine());          //creating string buffer with reading the input from user

        System.out.println("Enter a sentence");

       // String str = sc.nextLine();

        sb.reverse();           //reverse method to reverse the string

        System.out.println(sb);

        sc.close();


    }
}
