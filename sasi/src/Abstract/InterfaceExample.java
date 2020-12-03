package Abstract;
//import java.net.InterfaceAddress;

import Interface.Interface3; //  importing packages with class name

public class InterfaceExample  // class 
 {
     void Interface() // method for class 
     {
         System.out.println("this is interface");
     }
    public static void main(String[] args) {
        Interface3 i=new Interface3(); // object created for class 
        i.display(); //  method for calling with class object
        i.pack();
        i.show();
        InterfaceExample i1= new InterfaceExample(); // object created for class
        i1.Interface(); // method for calling with class object

    }
}
