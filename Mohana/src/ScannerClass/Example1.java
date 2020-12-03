package ScannerClass;  
import java.util.Scanner;

public class Example1 
{ 
    public static void main(String[] args) 
    {  

        Scanner sc = new Scanner(System.in); //scanner object creation
           
        //for string 
        System.out.println("Enter your name : " );
        String name = sc.next();//to take input as string value
        //String name = sc.nextLine();
        System.out.println("Name is " +name); 

         //for int
        System.out.println("Enter your age : "); 
        int age = sc.nextInt(); //for int value 
        System.out.println("Age : " +age); 

        //for float 
        System.out.println("Enter your salary :");
        float sal = sc.nextFloat();
        System.out.println("Salary : "+sal); 

        //for long 
        System.out.println("enter mobile num : ");
        double num = sc.nextDouble();
        System.out.println("Mobile number : " +num);
            
        //for boolean
        System.out.println("boolean check");
        boolean t = sc.nextBoolean();
        System.out.println("famale :" +t);

          sc.close();//to close the scanner class

    }  
}
  