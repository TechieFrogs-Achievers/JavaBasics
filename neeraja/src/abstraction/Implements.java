package abstraction;

//import inheritence.*;
import interfaces.Sample4;

//implementing sample4 interface from other package 
class S implements Sample4{
    //implementation of move method
    public void move(){//methods in interface are always public 
                     //because the visibility is not decreased while overriding in child class
                     //if we remove public access for method it shows error
        System.out.println("car mving with high speed");
    }
    //implementation of bark method
    public void bark(){
        System.out.println("dog is barking");
    }
    //implementation of flow method
    public void flow(){
        System.out.println("river is flowing");
    }

}


public class Implements  {
    public static void main(String[] jn){
        //instantiation of implemented class
        S sad=new S();
        //calling implemented methods
        sad.move();
        sad.bark();
        sad.flow();

    }

}
