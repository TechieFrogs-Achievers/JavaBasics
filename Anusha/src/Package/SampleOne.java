package  Package;

public class SampleOne 
{
    public void sampleOne()//public method
    {
   System.out.println("Frist Package:"); 
    }
     private void simple()//private method
     {
      System.out.println("Second package:");
     }
     
   public static void main(String[] args) 
   {
       SampleOne s=new SampleOne();//object creation
       s.sampleOne();//method calling
       s.simple();//method calling
   } 
}



