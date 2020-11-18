
 public class Method 
{
    int sum=78;
    static int Num=56;
    
    void demo()
     {
         int var=40;
         {
             System.out.println("in block");
             int k=10;
             System.out.println(k);
         }
         System.out.println(var);
     }
   public static void main(String args[]) 
    {      
       int value=35;
        System.out.println (value);
        System.out.println(Num);
        Method m = new Method();
        m.demo();
        System.out.println(m.sum);
   } 
    
}
