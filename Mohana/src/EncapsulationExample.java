class Department
{
    private String name ;  //private variable
    private  int id; //private variable
    
  public String getName() //getter method to read and return a value of name
  {
      return name;
  } 
  public int getId() // getter method to read and retutn a value of Id
  {
      return id;
  }

  public void  setName(String name) //setter method to set the value of name
  {
      this.name = name;
  }  
  public void setId( int id )//setter method to set the value of id
  {
      this.id = id;
  }

}


public class EncapsulationExample 
{
    public static void main(String[] args) 
    {

        Department dpt = new Department();
        dpt.setName("IT");  //setting values 
        dpt.setId(1234);

        System.out.println(dpt.getName()); //calling of getter method
        System.out.println(dpt.getId()); //calling of getter method
    }
    
}
