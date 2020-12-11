package MethodsExamples;

import java.util.Scanner;

class Student
{
    public String name ;
    public int age;
    public String address;
     public Student(String n , int a,String ad) //constructor having three parameters 
     {
        n = "Unknown";
        a = 0;
        ad = "not available";
     } 
     public void setInfo(String name, int age)//method having 2 parameters 
     {
         System.out.println("name of student  is : " +name + "\n"+" age of student : " +age);
     } 
     public void setInfo( String name ,int age ,String address)//overloaded method having 3 parametrs 
     {
         System.out.println("name of  student  : "  +name +  "\n" +" age of student :  " +age  + " \n"+ " Address of student is : " +address);
     }  

     void display()
     {
         System.out.println("Name : " +name);
         System.out.println("Age : " +age);
         System.out.println("Address : " +address);
     }
}  
public class Example4 
{  
    public static void main(String[] args) 
    {   
      
        Student s[] = new Student[10];//creating new student obj
        String name, address; int age;

        System.out.println(" Enter Details of Students "); 

        Scanner sc = new Scanner(System.in); //creating scanner obj

        for (int i = 0; i < 10; i++) //loop for entering students details
        {
            System.out.println(" Enter details of " + (i + 1) + " Student");
            System.out.println("Name : "); 
            name = sc.next();
            System.out.println("Age : ");
            age = sc.nextInt();
            System.out.println("Address : ");
            address = sc.next();

            s[i]= new Student(name,age,address); //creating students obj

            System.out.println("Displaying  Details of " +i+1 + "students");

            s[i].setInfo(name, age,address); //method call

            
        }

       /* System.out.println("Displaying Details of Students Entered");
        for (int i = 0; i < 10; i++) 
        {
           System.out.println("Details of " + (i + 1) + " Student is");
           s[i].display();
            
        }*/

        sc.close();
        
    }

    
}
