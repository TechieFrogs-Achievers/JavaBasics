 abstract class Jaya
 {
     abstract void naga();//methode
 }
 class Vina extends Jaya//class extend
 {
      void naga()//methode
     {
         System.out.println("jaya naga durga bhavani");
     }
 }
 
 class Anusha extends Jaya//class extend
 {
   void naga()//methode
   {
      System.out.println("anupriya");
   }
 }

 public class Abstract1
 {
   public static void main(String[] args) 
   {
       Jaya j=new Vina();
       j.naga();
       Jaya ja=new Anusha();
       ja.naga();
     }
 } 
     
 
    

