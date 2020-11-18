public class Methods3     
{
    static void add () //method without parameters
         {
    
             int x=10;
             int y=10;
            System.out.println(x+y); //addition of two numbers     
    
         }
            static void mul (int a, int b) // method  with paramters
            {

                 int c=a*b; //multiplying of two numbers
                 System.out.println(c);
            }

         public static void main(String args[])
         {
    
         Methods3 met=new Methods3();
         Methods3.add(); //20
         Methods3.mul(10,30); //300

         }

}
         
         
    