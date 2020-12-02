package Abstract;
import Interfce.MyPack; //import interface package and mypack

public class InterfaceSample  // parent class
 {
     protected class Sampleclass implements MyPack // nested class
     {
         public Sampleclass()  //default constructor
        {

		}

		public void Demo() //implementing mypack abstract method
         {
             System.out.println("Multiple packages in interface");
         }

     }
}
