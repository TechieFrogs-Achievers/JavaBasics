package inheritence;

import abstraction.inter;
import interfaces.Sample4;

//extending the inner protected class from another package 
class Call extends inter {
    //method to instantiate extended class
    public Sample4 returns(){
    //instantiation of parenr class
     Inner i=new Inner();
     inter r = new inter();
     //upcasting(assigning child object to parent reference)
     Sample4 s=new Inner();
     s.move();
     s.flow();
     s.bark();
     i.move();
     i.flow();
     i.bark();
    /* r.move();
     r.flow();
     r.bark();*/
     //returning reference of interface Sample4
     return s;
     
    }
}



public class Inheritt {
    public static void main(String[] k){
        //instantiation of a class
        Call cobj=new Call();
        Sample4 d=cobj.returns();
        System.out.println("object located at :"+d);
    } 
    
}
