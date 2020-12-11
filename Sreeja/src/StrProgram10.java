import java.util.*;
public class StrProgram10 
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);        //creating scanner class object

        System.out.println("Ennter a sentence");

        String str = sc.nextLine();             //read the string from user

        str = str.replace(" ","");        //using replace()method to remove white sentence

        System.out.println("after removing white spaces:  "+str);      //print the result

        sc.close();





    }
}
