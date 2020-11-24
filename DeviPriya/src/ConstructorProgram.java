 class Employee2{


//instance variables
int  salary,yearOfJoining;
String address,name;
//parametrised constructor
public Employee2 (String name,int yearOfJoining,int salary,String address)
{
    this.name= name;
    this.yearOfJoining = yearOfJoining;
}
 }
public class ConstructorProgram {
public static void main(String[] args) {
    System.out.println("Name" + "       " + "year of joining" + "   "+ "salary"+ "       "+"Address");
    //same class with  different objects
    Employee2 e1 = new Employee2("Robert", 1994,20000,"64C- WallsStreat");
    Employee2 e2 = new Employee2("Sam   ",2000,40000,"68D- WallsStreat");
    Employee2 e3 = new Employee2("John  ",1999,35000,"26B- WallsStreat");
}
}










