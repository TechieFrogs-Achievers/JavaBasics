public class MethodsExamples
{
int  sum(int x, int y)//non-static method
{
    return x+y;
}
public static void getMinimum(int a, int b)//static method
{
if(a<b)
{
    System.out.println(a + " is the minnimu of two");
}
else if(b<a)
{
    System.out.println(b + " is the minnimu of two");
}
else
{
    System.out.println("both are equal");
}
}
public static void main(String[] args)
{
    getMinimum(5, 9);//5

    MethodsExamples ob = new MethodsExamples();
    int z = ob.sum(4, 6);
    System.out.println(z);//10
}
    
}

