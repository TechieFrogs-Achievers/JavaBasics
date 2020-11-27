abstract class  Parent //abstract class 
{
   abstract void Message(); // abstract methods 
}
 class Abstractclass extends  Parent  // parent class aquring the propeties abstract class 
 {
     void Message()
     {
         System.out.println("this is first subclass");
     }
    }
     class Abstractclass1 extends Parent //child class acquring the  propeties abstaract class
     {
         void Message()
         {
               System.out.println("this is second class");
         }
        
         public static void main(String[] args)
          {
              Parent ab=new Abstractclass1(); //object creating for child class(upcasting)
              Parent  ab1=new Abstractclass(); //object creating for parent class (upcasting)
              ab.Message(); //calling  the method with object of child class
              ab1.Message();
            }
        }
        

