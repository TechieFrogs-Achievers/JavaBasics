package I.Ostreams;

import java.util.Scanner;//package for scanner

public class ScannerExamples 
{
    public static void main(String[] args)
    {
   Scanner sc = new Scanner(System.in);//creating the object for scanner
   System.out.println("enter the student name");
   String name = sc.nextLine();//to read the string
   System.out.println("student name ="+name); 

   System.out.print("enter the roll number");
   int roll_num = sc.nextInt();//to read the input integer
   System.out.println("roll number = "+roll_num);//printing the number

   System.out.println("enter the total marks ");
   short marks = sc.nextShort();//to read the short type
   System.out.println(" total marks ="+marks);

   System.out.println("enter the age of student");
   byte age = sc.nextByte();//to read the byte type
   System.out.println("age ="+age);
   sc.close();//close the scanner class
  
    }


}
