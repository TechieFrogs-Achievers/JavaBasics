public class Methods
{
    public int sub() // method without parameters
    {

         int a=10;
         int b=20;
         return b-a; //subtaction of two numbers
         
    }
     
      public int mul (int x,  int y) // method with parameters
      {    

      return x*y;

      }
       public static void main(String[] args)
       {
           
        Methods met=new Methods();
        int c=met.sub();
        int d=met.mul(10,20);
        System.out.println(c); //10
        System.out.println(d); //200

       }
 
    
}
