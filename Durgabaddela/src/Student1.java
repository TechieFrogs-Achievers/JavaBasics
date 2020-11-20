public class Student1
{
  String name;
  int rollNumber;
  long phoneNumber;
  String address;

  public Student1(String name, int rollNumber, long phoneNumber, String address)
  {
       name = name;
       rollNumber = rollNumber;
      phoneNumber = phoneNumber;
      address = address;
      System.out.println("name  " +" "  +rollNumber+" "  +phoneNumber +  " address" );

  }
  public static void main(String[] args) 
  {
      Student1 s1 = new Student1("sam", 1, 8247258176l, " rajahmundry");
      Student1 s2 = new Student1("jhon", 2, 984728473l, " nuzvid");

  }  
}

