package Interfce;
interface interPackage //interface
{
    public void SampleDisplay(); //methods
    public void SampleDisplay1(); //Abstract method
    public void SampleDisplay2();

}

public class InterfaceExercise3 implements  interPackage //impletents the interface details
 {
    public void SampleDisplay() //implementing the abstract method
    {
        System.out.println("..1..");
    }
    public void SampleDisplay1()
    {
        System.out.println("..2.."); //print the SampleDisplay1 result
    }
    public void SampleDisplay2()
    {
        System.out.println("..3..");
    }
    public static void main(String[] args) 
    {
        interPackage a = new InterfaceExercise3(); //creating object
        a.SampleDisplay();
        a.SampleDisplay1();
        a.SampleDisplay2();//calling method by using object
        
    }
}
