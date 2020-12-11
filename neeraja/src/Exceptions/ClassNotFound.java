package Exceptions;

//program throwingg class not found exception 
public class ClassNotFound   {
  public static void main(String[] l){
      //try block holding complicated logic
      try{
      Class.forName("Index");
         int a=0;
         int b=8;
         int c=a+b;
         System.out.println(c);
      }
      //exception handler
      catch(ClassNotFoundException c){
          System.out.println(c);
      }
    } 
    
}

