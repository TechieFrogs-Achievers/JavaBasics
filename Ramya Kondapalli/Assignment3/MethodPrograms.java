import java.util.Scanner;

class StudentDetails {

    //instance variables
    String name;
    int age;
    String address;

    public StudentDetails(String str,int i,String add){ //constructor 

        //default values
        name = "Unknown";
        age = 20;
        address = "hyd";
    }

    //methods for displaying details
    void setInfo(String name, int age){

        System.out.println("Student Name : " + name + "Age of Student :" + age);
    }
    void setInfo(String name ,int age,String address){

        System.out.println("Student Name : " + name + " Age of Student :" + age + " Address :" + address);
    }

}

public class MethodPrograms {
    public static void main(String[] args) {
        
        StudentDetails s[] = new StudentDetails[10];  //array declaration

        System.out.println("Enter student details");

        Scanner sc = new Scanner(System.in);

        //entering student details
        for(int i=0;i<10;i++){

            System.out.println("Enter " + (i+1) + " student details");

            System.out.println("Name :");
            String name = sc.next();

            System.out.println("Age :");
            int age = sc.nextInt();

            System.out.println("Address :");
            String address = sc.next();
        
            s[i] = new StudentDetails(name,age,address); //creating object for array

            System.out.println("Displaying Student details ");

            s[i].setInfo(name, age, address);  //method calling for printing details
        }   
        sc.close();
    }
}

