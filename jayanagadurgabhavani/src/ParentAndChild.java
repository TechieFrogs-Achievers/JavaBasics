

public class ParentAndChild 
{
     void parent()
     {
        System.out.println(" this is a parent class");
     }
    } 
 class Methode1 extends ParentAndChild
 {
   void child()
   {
       System.out.println(" this is a child class");
   }
  
 public static void main(String[] args) 
 {
    ParentAndChild p=new ParentAndChild ();
    //ParentAndChild c=new ParentAndChild();//
    Methode1 m=new Methode1();
    p.parent();
    //c.methode1();
    m.parent();
    m.child();
 }
}
