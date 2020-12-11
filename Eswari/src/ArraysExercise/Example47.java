package ArraysExercise;
// import java.util.Arrays;
import java.util.Scanner;

//class to convert character to string and vice versa
public class Example47
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        int length = scan.nextInt();                        //taking length of an array from user
        char array[] = new char[length];                    //creating character array
        for(int i = 0; i < array.length; i++)               //reading characters from console
        {
            //reading characters
            array[i] = scan.next().charAt(0);
        }
        //characters to string conversion
        String str = String.valueOf(array);
        // System.out.println(Arrays.toString(array));
        System.out.println("conversion of characters to string : " +str);
        
        char ch[] = new char[str.length()];                 //creating character array for storing string characters
        for(int i= 0; i < str.length(); i++)                //reading  character array
        {
            ch[i] = str.charAt(i);
            // char ch[] =str.split(str.charAt(i));
        }
        //conversion of string to characters
        System.out.println("conversion of string to characters : ");
        for(int i = 0; i < ch.length; i++)
        {
            System.out.print(ch[i] +" ");
        }
        scan.close();               //scanner close
        
    }
}