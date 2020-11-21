class Student1{
    //instance variables
    String name;
    int roll_no;
    long phoneNumber;
    String address;
    //create constructor
    public Student1(String name, int roll_no, long phoneNumber, String address)
    {
        this.name = name;//using this keyword for pointing current object
        this.roll_no = roll_no;
        this.phoneNumber = phoneNumber;
        this.address = address;
        System.out.println("name :" + name + " Roll no :" + roll_no +
        " phone number :" + phoneNumber + " Address :" + address);
    }
}
public class ConstructorProgram2 {
    public static void main(String[] args) {
        //creating two objects for same class
       Student1 s1 = new Student1("Sam",1,358872871,"Hyd"); //parametrised constructor
       Student1 s2 = new Student1("John",2,657688768,"Rjy");//parametrised constructor
    }
}
