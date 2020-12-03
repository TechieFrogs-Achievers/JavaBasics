package Interface; //Package Interface
interface Student // interface 
{
    void attendance(); //methods
    void percentage();
    void marks();
}
public class InterfaceClass3 implements Student // class implements interface
{
   public void attendance() //Implementing the methods 
   {
    System.out.println("Attendance:");
   }
  public  void percentage()
   {
       System.out.println("Percentage:");
   }
  public void marks()
  {
      System.out.println("Marks:");
  }

    public static void main(String[] args) 
    {
        InterfaceClass3 sd=new InterfaceClass3(); // obj creation
        sd.attendance(); //method calling for attendance
        sd.marks(); // methods calling for marks
        sd.percentage(); // methods calling for percentage
    }
}                                                    
