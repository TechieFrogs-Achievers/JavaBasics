package scanner;

import java.util.Scanner;

public class Compare1 {

    public static void main(String[] args) 
    { 
       
        // Declare the  object and initialize with 
        // predefined standard input object 
        Scanner scobj = new Scanner(System.in); 
  
        // String input 
        String name = scobj.next(); 
  
        // Character input 
        char gender = scobj.next().charAt(0); 
  
        // Numerical data input 
        // byte, short and float can be read 
        // using similar-named functions. 
        //int age = sc.nextFloat(); //throw inputmismatch exception
        int age = scobj.nextInt();
        long mobileNo = scobj.nextLong(); 
        double cgpa = scobj.nextDouble(); 
  
        // Print the values to check if the input was correctly obtained. 
        System.out.println("Name  : "+name); 
        System.out.println("Gender: "+gender); 
        System.out.println("Age   : "+age); 
        System.out.println("Mobile Number: "+mobileNo); 
        System.out.println("CGPA  : "+cgpa); 


        scobj.close();
    } 
}
