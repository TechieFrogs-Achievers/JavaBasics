package Packages;
import Interface.Pack;   //importing the interface package 
import Abstract.Interfaceexample7;   //importing the package from the abstract package

public class Importedinterface extends Interfaceexample7    //class implements the abstarct package
 {
     public void show()    //creating the method
     {
         input2 i = new input2(); //calling the abstract package method
         i.Input();
         Pack p = new input2();    //upcasting 
         p.Input();
     }
     public static void main(String[] args) 
     {
         Importedinterface f = new Importedinterface();   //creating object for the class 
         f.show(); //calling the method 
     }

    
}
