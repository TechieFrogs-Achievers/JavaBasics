public class MethodsStatic
{
    public static void sumOfTwoNumbers(int x, int y)  //static type method with parameters 
    {
      int z=x+y; 
      System.out.println(z); 
    }

    public static void subtractionOfNumbers()  //static type method without parameters
    {
        int a=6,b=7;
        int c= a+b;
        System.out.println(c);
    }
    public static float multiplication()  //static int type method without parameters
    {
        int m=5,n=7;
        int o=m*n;
        return o;  
    }
    public static int divisionOfTwoNumbers(int p,int q)  //static int type method with parameters
    {
        int r = p/q;
        return r;
    }
public static void main(String args[]) 
    {
        sumOfTwoNumbers(8,4);    //12
        subtractionOfNumbers();   //13
        System.out.println(multiplication());    //35
        System.out.println(divisionOfTwoNumbers(10,5));  //2
    }
}

