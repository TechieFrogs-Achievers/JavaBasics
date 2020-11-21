 class Student2{
    int rollno;
    String name;
    float fee;
    Student2(int rollno,String name,float fee)
    {
      this.rollno=rollno;
      this.name=name;
      this.fee=fee;

    }
    void show()
    {
      System.out.println(rollno+" "+name+" " +fee);
    }
  }

      

public class Student1
{
  public static void main(String args[])
  {
    Student2 s=new Student2(10,"satya",5677f);
    Student2 s2=new Student2(11,"pachigolla",4556f);
    s.show();
    s2.show();
  }
}

