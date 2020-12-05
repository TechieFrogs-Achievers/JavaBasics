package I.Ostreams;

import java.util.Scanner;

public class StringReadExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);//creating an object for scanner  
        /*System.out.println("enter the full name");
        String fullName = sc.next();//to read the first word of string
        System.out.println(fullName);*/

        System.out.print("Enter your name: ");  
        String name = sc.nextLine();//to read the complete string  
        System.out.println("Name is: " +name);
        int num = sc.nextInt();//reading integer
        System.out.println(num);
         
        sc.close();             
        }  
    }

