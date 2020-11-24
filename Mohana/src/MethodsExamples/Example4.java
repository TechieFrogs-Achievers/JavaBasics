package MethodsExamples;

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
}  
public class Example4 
{  
    public static void main(String[] args) 
    {
        Student std = new Student("unknown", 0, "Not available");//object creation
        //std.setInfo( "John", 15);
        std.setInfo( "john",15, "Hyderabad");//calling method having 3 params

        
    }

    
}
