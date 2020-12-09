package Test;

import Interface.InterfaceExcercise3; //import another package 

//implementing that imporated package file 
class Test implements InterfaceExcercise3{

    public void display() {
        System.out.println("1st method");
    }

    public void display1() {
        System.out.println("2nd method");
    }

    public void display2() {
       System.out.println("3rd method");
    }
}
//main class
public class InterfaceImplementation3 {
    public static void main(String[] args) {

        //creating obj to the class 
        Test t = new Test();
        
        //calling methods 
        t.display();
        t.display1();
        t.display2();
    }
}
