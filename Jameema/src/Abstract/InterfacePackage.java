package Abstract;
import Interfce.InterfaceExercise3; //import the another package class

public class InterfacePackage  //interface
 {
    public void PaSample() //method
    {
        System.out.println(" main method");
    }
     public static void main(String[] args)  //main method
     {
         InterfaceExercise3 a = new InterfaceExercise3(); //creating object to imported class
         a.SampleDisplay();
         a.SampleDisplay1();//calling imported class methods by using object
         a.SampleDisplay2();
         InterfacePackage i = new InterfacePackage(); // creating object
         i.PaSample(); //calling method
         
     }   
}
