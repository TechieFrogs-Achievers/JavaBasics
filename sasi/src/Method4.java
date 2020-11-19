public class Method4 
{
    static int div() // method without parameters
    {

        int a=10;
        int b=20;
        return a/b; //division of two numbers

    }
       static int mul (int x,  int y) // method with parameters
       {
            return x*y;
       }
     public static void main(String[] args)
     {

        int c= Method4.div();
        int d= Method4.mul(10,20);
        System.out.println(c);//0
        System.out.println(d);//200
     }
  


}



