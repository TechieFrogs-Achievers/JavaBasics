package Interface;

interface Candidate{
    void student(String Student);
    void teacher();
}
interface StudentName{
    void firstName(String firstName);
    void lastName(String lastName);
}
interface Department{
    void ece(String branch);
    void cse();
}
interface School extends Candidate,StudentName,Department{
    void rollNo();
}
class Details implements School{

    public void student(String student) {
        System.out.println("category :" + student);
    }
    public void teacher() {
        System.out.println("Teacher");
    }
    public void firstName(String firstName) {
        System.out.println("First name :" + "Ramya");
    }
    public void lastName(String lastName) {
        System.out.println("Last name :" + "kondapalli");
    }
    public void ece(String branch) {
        System.out.println("Branch :"+branch);
    }
    public void cse() {
        System.out.println("Branch Cse");
    }
    public void rollNo() {
        System.out.println(101);
    }   
}
public class InterfaceExcercise6 {
    public static void main(String[] args) {
        Details d= new Details();
        d.student("Student");
        d.firstName("Ramya");
        d.lastName("Kondapalli");
        d.ece("ECE");
    }
}
