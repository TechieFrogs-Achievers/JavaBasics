class Student{
    //Instance Variables
    String name ;
    int roll_no;
}
public  class ConstructorProgram1{
    public static void main(String[] args) {
        Student s= new Student();
        s.name = "John";  //assigning values 
        s.roll_no = 2;
        System.out.println("Name : " + s.name); //printing by calling with object
        System.out.println("Roll No : " + s.roll_no);
    }
}
