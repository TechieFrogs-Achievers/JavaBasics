public class Student1 
{
    String name;
    int roll_no;
    long phone_no;
    String address;
    //creating of two students details
    public static void main(String[] args) 
     {
       //objecr 1
        Student1 s1 = new Student1();
        s1.name =("sam");
        s1.roll_no=566;
        s1.phone_no= 630033946;
        s1.address= "veeravaram";
        System.out.println("student1 name:" + s1.name );
        System.out.println("student1 roll_no:" + s1.roll_no);
        System.out.println("student1 phone_no:" + s1.phone_no);
        System.out.println("student1 address:" + s1.address);
      Student1 s2 = new Student1();
      // object2
        s2.name =("john");
        s2.roll_no=528;
        s2.phone_no= 630063946;
        s2.address= "veeravaram";
        System.out.println("student2 name:" + s2.name );
        System.out.println("student2 roll_no:" + s2.roll_no);
        System.out.println("student2 phone_no:" + s2.phone_no);
        System.out.println("student2 address:" + s2.address);
    
    }
        
}
