package Assignment4;

import java.util.Scanner;

class Student {
    String name,address;
    int age;
    public  Student(String name,int age,String address)
    {
        System.out.println(name +" "+ age +" "+ address);
    }
    public void display()
    {
        Scanner s = new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            String name = s.next();
            int age = s.nextInt();
            String address = s.next();
        }
        System.out.println(name +" "+age + " " + address);
    }
}
public class MethodsExercise4 {
    public static void main(String[] args) {
        Student s = new Student("unknown",0,"not available");
        s.display();
    }
}
