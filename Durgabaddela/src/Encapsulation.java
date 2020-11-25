 class EncapuslationTest
{
    //declaring data members

    private String StudName;
    private int  StudId;
    private String StudAddress;

    // setters for instance members

    public void setStudName(String StudName)
    {
        this.StudName = StudName;
    }
    public void setStudId(int StudId)
    {
        this.StudId = StudId;
    }
    public void setStudAddress(String StudAddress)
    {
        this.StudAddress = StudAddress;
    }

    //getters to retrive the data

    public String getStudName()
    {
        return StudName;
    }
    public int getStudId()
    {
        return StudId;
    }

    public String getStudAddress()
    {
        return StudAddress;
    }
}
public class Encapsulation
{
  public static void main(String[] args) 

  {  // creating object for instance class

    EncapuslationTest et = new EncapuslationTest();

    // setting the data

     et.setStudName("Durga");
     et.setStudId(5);
     et.setStudAddress("vijayawada");

     // getting the data

     System.out.println("Student name ="+   et.getStudName());
     System.out.println("Student name ="+   et.getStudId());
     System.out.println("Student name ="+   et.getStudAddress());




  } 
}
