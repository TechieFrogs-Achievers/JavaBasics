class PrintNumber
{
    //method overloading 
    public void printn(int a) //method with int datatype
    {
        System.out.println("the value of integer" +a);
    }
    public void printn(char c) //parameterised method with char
    {
        System.out.println("the character is " +c);
    }
    public void printn(double d) //with double
    {
        System.out.println("the value of double is :"+d);
    }
    public void printn(String s) //with string
    {
        System.out.println("the string is  :" +s);
    }
}
public class MethodExercise1 
{
    public static void main(String[] args) 
    {
        PrintNumber p = new PrintNumber(); //creating a object
        p.printn(5); // calling method using object
        p.printn('h'); //passing values through method
        p.printn(651.354);
        p.printn("jemima");
    }
    
}
