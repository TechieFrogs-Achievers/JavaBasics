import java.io.IOException;
    class M
    {
       void methode()throws IOException
       {
         throw new IOException("methode");//throw key by exception
       }

    }

   public class ExceptionHandling9
    {
      public static void main(String[] args) 
      {
        try{  
            M m=new M();  //methode
            m.methode();  
           }
           catch(Exception e)
           {
               System.out.println("exception handled");
            }     
         
           System.out.println("normal flow...");  
      }
    }

