package StringsExercise;

import java.util.Scanner;
//driver class
public class ExampleOnIndexOf
{
    public static void main(String args[])
    {   
        Scanner scan = new Scanner(System.in);              //scanner method
        String str = scan.nextLine();                       //taking string value by console
        String s = scan.nextLine();
        //indexOf checking whether the string contaions that subtring if contains it gives value otherwise it gives -1
        System.out.println(str.indexOf(s));             
        scan.close();
    }
        
    
    
}