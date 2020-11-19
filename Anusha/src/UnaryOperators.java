public class UnaryOperators 
{

    //main method
    public static void main(String[] args)
    {
        int x=18;    
       System.out.println(x++);//18(19)
       System.out.println(++x);//20
       System.out.println(x--);//20(19)
       System.out.println(--x);//18
       UnaryOperators u= new UnaryOperators();//create an object for class
       u.unary();//calling method
    }
     
     //unary method
     public void unary()
     {
        int a=20;
        int b=30;
        System.out.println(++a + ++b);//21+31=52
        System.out.println(a++ + b++);//21+31=52
        System.out.println("a value is:"+a+"\n"+"b value is: "+b);//print a=22,b=32 values
        System.out.println(--a + --b);//21+31=52
        System.out.println(a-- + b--);//21+31=52
        System.out.println(a++ + ++b);//20+31=51
        System.out.println(++a + b++);//22+31=53
        System.out.println(a-- + --b);//22+31=53
        System.out.println(--a + b--);//20+31=51
        System.out.println(a-- + ++b);//20+31=51
        System.out.println(++a + b--);//20+31=51
        System.out.println("a value is:"+a+"\n"+"b value is: "+b);//print a=20,b=30 values
        System.out.println(++a + a--);//21+21=42
        System.out.println(++b + b--);//31+31=62

      }

}

