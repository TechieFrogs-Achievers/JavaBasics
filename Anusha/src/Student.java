class Student
{
    String name,address;
    int roll_num;
    long ph_num;    
  public static void main(String[] args) 
  {
    Student s= new Student();//create object
    s.name="jhon";//assign values
    s.roll_num=2;
    s.address="d.no=1-2,rajahmundry";
    s.ph_num=1122334455l;
    System.out.println("Name of a student:"+s.name+"\n"+"roll number:"+s.roll_num+"\n"+"Address:"+s.address+"\n"+"phone number:"+s.ph_num); 
    System.out.println("---------------------------");
    Student s1= new Student();//create object
    s1.name="sam";
    s1.roll_num=502;
    s1.address="d.no=1-237,rajanagaram";
    s1.ph_num=5588462134l;
    System.out.println("Name of a student:"+s1.name+"\n"+"roll number:"+s1.roll_num+"\n"+"Address:"+s1.address+"\n"+"phone number:"+s1.ph_num); 
    
    
  }  
 
}