import java.util.*;
public class Method4Array {
     class Student 
    {
        String name;
         int age;
         String address;
        public Student(String name2, int age2, String address2)
        {
         this.name="unknown";
         this.age=0;
         this.address="not avaliable";
         }
         public void setInfo(int age,String name)
         {
          System.out.println("name of student  is : " +name + "\n"+" age of student : " +age);
         }
         public void setInfo( String name, int age ,String address)
         {
          System.out.println("name of  student  : "  +name +  "\n" +" age of student :  " +age  + " \n"+ " Address of student is : " +address);
         }
         void display()
         {
             System.out.println("Name : " +name);
             System.out.println("Age : " +age);
             System.out.println("Address : " +address);
         }}
         public static void main(String[] args) 
         {
    
         Student s[] = new Student[10];
             String name, address; int age,j=10;
             System.out.println(" Enter Details of Students ");
    
             Scanner sc = new Scanner(System.in);
    
             for (int i = 0; i < 10; i++) 
             {
                 System.out.println(" Enter details of " + (i + 1) + " Student");
                 System.out.println("Name : ");
                 name = sc.next();
                 System.out.println("Age : ");
                 age = sc.nextInt();
                 System.out.println("Address : ");
                 address = sc.next();
                 s[i]= new Student(name,age,address);
                 s[i].setInfo(name, age,address);
    
          }
       }
    }