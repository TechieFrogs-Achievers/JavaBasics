package Assignment4;
//class consists of data members
class Member{
    String name,address;
    int age;
    long phoneNumber;
    double salary;
    void printSalary(int i){
        System.out.println(i);
    }
}
//child class extends parent class
class Manager extends Member{
    String specialisation="Front-end-Developer";
}
//another child class inheriting properties of parent class
class Employee extends Member{
    String dept="Software Developer";
}
public class Inheritence3 {
    public static void main(String[] args) {
    //System.out.println("name"+" "+ "age"+ " "+"phone number"+" "+" address"+" "+"branch"+" "+"salary");
    Member mem = new Member();
    Manager m = new Manager();
    Employee e = new Employee();
    //assigning values to the data members through objects
    m.name="Ramya";
    m.age= 20;
    m.phoneNumber=987654321;
    m.address= "hyd";
    System.out.print(m.name+" "+m.age+" "+m.phoneNumber+" "+m.address+" "+m.specialisation+" ");
    m.printSalary(150000);
    e.name = "Teja";
    e.age=24;
    e.phoneNumber=876543219;
    e.address = "Rajahmundry";
    System.out.print(e.name+" "+e.age+" "+e.phoneNumber+" "+e.address+" "+e.dept+" ");
    e.printSalary(20000);
    }
}
