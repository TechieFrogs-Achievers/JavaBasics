package AbstarctClasses;
//import Interface.*;
import Interface.Example3;

public class InterfacesImplementation //implements InterfaceExample 
{
    // public void add(int a, int b)
    // {
    //     int c = a + b;
    //     System.out.println(c);
    // }
    // public void sub(int a, int b)
    // {
    //     int c= a - b;
    //     System.out.println(c);
    // }
    // public void mul(int a , int b)
    // {
    //     int c = a * b;
    //     System.out.println(c);
    // }

    //normal class
    void normal()
    {
        System.out.println("hai interfaces........");
    }

    public static void main(String[] args) {
        Example3 e = new Example3();                    //different packages file object creation
        InterfacesImplementation i = new InterfacesImplementation();                //object creation for this package file
        i.normal();                                                         //this package method calling   
        e.add(7,8);                                                         //different package methods calling by using their object
        e.sub(2, 1);
        e.mul(8, 2);
        
    }
    
}
