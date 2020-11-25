class Method4{
    private void parent(){
 
     System.out.println( "This is a parent class"); 
    }
         
 }
   class Method5 extends Method4
 {
   void  child()
     {
     System.out.println( "This is a child class"); 
     }
   }
   public class ParentClass
   {
 public static void main(String args[])
  {
     Method4 m4= new Method4(); //parent class object creation

     Method5 m5= new Method5();//child class object creation

      m4.parent();  //compile time error because parent method is private

      m5.child();   //child method calling by using child class object 
 
      m5.parent();    //compile time error because parent method is private
 
 }
 }
 