package abstraction;

import interfaces.Sample4;

//creating nested classes 
public class inter {
    //inner class implementing an interface from other package
    protected class Inner implements Sample4{
        //constructor 
        public Inner() {
        }
        //implementing abstract class
		public void move(){
            System.out.println("iam moving");
        }
        //implementing abstract class
       public  void flow(){
           System.out.println("i am flowing");
        }
        //implementing abstract class
        public void bark(){
            System.out.println("iam barking");
        }

    } 
}
