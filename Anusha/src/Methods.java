public class Methods
 {
     //withoutreturntype method
     public void withoutReturnType()
         {
            int val1=1233;
            int val2=1548;
            System.out.println("without return type:");
            System.out.println("add is:"+(val1+val2));//2781
    
         }
      //withreturntype method
     public int withReturnType()
         {
            int val1=12;
            System.out.println("with return type:");
            return val1;
         }
       //withparameters method
      public void withParameters(int x , int y )
         {
             int z=(x+y);
            System.out.println("withparameters:");
           System.out.println("the addition of two numbers is:"+z);
         }
      //withoutparameters meethod
         public void withoutParameters()
         {
           int x1=12;
           int y1=12;
           System.out.println("without parameters:");
           System.out.println("the addition of two numbers is:"+(x1+y1));
         }
     
     //main method
   public static void main(String[] args)
   {
       System.out.println("Main Metod is Excuted:");
       Methods m=new Methods();//object create for a class
       m.withReturnType();//calling method
       m.withoutReturnType();//calling method
       m.withoutParameters();//calling method
       m.withParameters(15, 50);//calling method
   } 
}
