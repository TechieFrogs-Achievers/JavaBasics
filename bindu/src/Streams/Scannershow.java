package Streams;
import java.util.*;   //using the scanner library

public class Scannershow  
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);   //using the scanner class 
        
        System.out.println("Enter your name:");   //prints the name 
        String name = sc.nextLine();    //using the string val
         System.out.println("Enter the marks:");
         int marks = sc.nextInt();   //using the integer data
         System.out.println("Enter the phno:");
         long phno = sc.nextLong();    //reads the longdatatype
        System.out.println("Enter the grade:");
         char grade = sc.next().charAt(1);    //character input
         //prints the values to check the values 
        System.out.println("Name is :"+name);
        System.out.println("Marks is :"+marks);
        System.out.println("Phno is :"+phno);
        System.out.println("Grade is :"+grade);   
          sc.close();
    }
    
}
