import java.util.*;

 class Student22
 {
    //datamembers
    
    public String name ;
    public int age;
    public String address;
    
    //three parameterized constructor
    
    public Student22(String n , int a , String ad) 
     {
        n = "Unknown";
        a = 0;
        ad = "not available";
     } 
     
    //method to print the name and age
    
     public void setInfo(String name, int age) 
     {
         System.out.println("name of student  is : " +name + "\n"+" age of student : " +age);
     } 
     
     //overloaded method to print name age and address

    public void setInfo( String name ,int age ,String address)
     {
         System.out.println("name of  student  : "  +name +  "\n" +" age of student :  " +age  + " \n"+ " Address of student is : " +address);
     }  

    //method to display the information
    
    void display()
     {
         System.out.println("Name : " +name);
         System.out.println("Age : " +age);
         System.out.println("Address : " +address);
     }
}

public class Methods4
 { 
    public static void main(String[] args) 
    {   
      
        Student22 s[] = new Student22[10];          //creating new student obj
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

            s[i]= new Student22(name,age,address); //creating students obj

            System.out.println("Displaying  Details of " +i+1 + "students");

            s[i].setInfo(name, age,address); //method call

            
        }
        sc.close();
}
 }
