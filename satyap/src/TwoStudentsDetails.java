  // Using Constructor with Parameters of student name,student rno,student phonenumber,address

public class TwoStudentsDetails {
    String name;
    int rno;
    long phonenumber;
    String address;

    TwoStudentsDetails(String stud_name,int stud_rno,long stud_num,String stud_address){
        name=stud_name;
        rno=stud_rno;
        phonenumber=stud_num;
        address=stud_address;

    }
    void display()
    {
        System.out.println(name+" "+rno+" "+phonenumber+" "+address);
    }
    public static void main(String[] args) {
        TwoStudentsDetails studentObj1=new TwoStudentsDetails("sam",10, 985242325,"hyd" );
        TwoStudentsDetails studentObj2=new TwoStudentsDetails("john",20, 954253222, "hyd");
        studentObj1.display();
        studentObj2.display();
    }
    
}
