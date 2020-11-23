class Encap
{
    //making fields private to acquire data hiding
    private String empName;
    private int empAge;
    
    //getters to get values
    public String getEmpName()
    {
        return empName;
    }

    public int getEmpAge()
    {
        return empAge;
    }

    //setter methods to set values
    public void setEmpAge(int newValue)
    {
        empAge = newValue;
    }

    public void setEmpName(String newValue)
    {
        empName = newValue;
    }
}


//MAIN CLASS
public class Encapsulation 
{
    public static void main(String[] uh)
    {
        //object for the class encap
        Encap obj=new Encap();

        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee Age : " + obj.getEmpAge());
    }
    
}
