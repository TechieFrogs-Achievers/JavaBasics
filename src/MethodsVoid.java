public class MethodsVoid
{
    public void sumOfTwoNumbers(int x, int y)  //void type method with parameters 
    {
      int z=x+y; 
      System.out.println(z); 
    }

    public void subtractionOfNumbers()  //void type method without parameters
    {
        int a=6,b=7;
        int c= a+b;
        System.out.println(c);
    }
    public int multiplication()  //int type method without parameters
    {
        int m=5,n=7;
        int o=m*n;
        return o;  
    }
    public int divisionOfTwoNumbers(int p,int q)  //int type method with parameters
    {
        int r = p/q;
        return r;
    }
public static void main(String args[]) 
    {
        MethodsVoid m=new MethodsVoid();
        m.sumOfTwoNumbers(8,4);    //12
        m.subtractionOfNumbers();   //13
        System.out.println(m.multiplication());    //35
        System.out.println(m.divisionOfTwoNumbers(10,5));  //2
    }
}