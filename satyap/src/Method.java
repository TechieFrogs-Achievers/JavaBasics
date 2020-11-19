
public class Method {
    public void sum() // No argument method void return type
    {
        int a=10;
        int b=20;
        System.out.println(a+b);// Addition of two numbers
    }
    public void subtraction(int c,int d) // Argument with void return type
    {
        System.out.println(c-d); // Subtraction of two numbers
    }
    public void mul(float e,int f) //Different Argument with void return type
    {
        System.out.println(e*f);
    }
    public int demo() // No argument with int Datatype
    {
        int a=30;
        int b=20;
        return a%b;
    } 
    public int div(int a,int b) // argument with int Datatype
    {
        int c=a/b;
        return c;
    }
    public static void evenNum(int num) // Argument with static method of void return type
    {
        if(num%2==0)
        {
            System.out.println( num+" " + "is even");
        }
        else
        {
            System.out.println( num+ " "  + "is odd");
        }
    }
    public static void number(int n) // Argument with static method of void return type
    {
         if(n<0)
        {
            System.out.println(n+" "+"is negative");
        }
        else
        {
            System.out.println(n+" "+ "is positive");
        }
    }
    public static int addition(int a,int b) // Argument with static method of int return type
    {
        return a+b;
    }
    public static int sub() // No Argument with static method of int datatype
    {
        int t=35;
        int r=24;
        return t-r;
    }

     
    public static void main(String args[])
    {
        // Method Calling for void return type

        Method m=new Method();
        m.sum();
        m.subtraction(20,15);
        m.mul(12.3f,10);

        //Method Calling for int Datatype

        int result=m.div(50,20);
        int add=m.demo();
        System.out.println(result);
        System.out.println(add);

        // Method Calling for static method 

        Method.evenNum(97);
        Method.evenNum(56);
        Method.number(-10);
        Method.number(23);

        // Method Calling for static method  int Datatype

        int s=addition(10, 20);
        System.out.println(s);
        int z=Method.sub();
        System.out.println(z);
    }
}
