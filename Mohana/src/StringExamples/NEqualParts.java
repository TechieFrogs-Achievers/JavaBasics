package StringExamples;

import java.util.Scanner;

public class NEqualParts 
{
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);//scanner class obj creation
    String str = sc.nextLine();//taking string input
    int n = sc.nextInt();//taking integer input
      
    int size = str.length(); 
    int equal_parts;
        
    if (size % n != 0) //condtion to check valid input or not
    { 
       System.out.println("invalid input");
    } 
       
    equal_parts = size / n; //here we are dividing our string length to get equal parts
          
    for (int i = 0; i< size; i++) 
    { 
        if(i % equal_parts == 0){//condition to check divisible or not
            System.out.println();
        }  
        System.out.print(str.charAt(i)); 
    } 
    sc.close();
    } 
      
}
    

