public class TwoStudents 
{
    String name;
    int rno;
    long phno;
    String address;
    

TwoStudents(String stud_name,int stud_rno,long stud_phno,String stud_address)
{
    name=stud_name;
    rno=stud_rno;
    phno=stud_phno;
    address=stud_address;

}
void display()
{
    System.out.println(name +" "+rno+" "+phno+" "+address);

}

public static void main(String args[])
{
    TwoStudents studentsobj1=new TwoStudents("sam", 20, 798173256,"banglore");
    TwoStudents studentsobj2=new TwoStudents("john",43,766564234,"banglore");
    studentsobj1.display();
    studentsobj2.display();
}
}
