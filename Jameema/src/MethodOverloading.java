public class MethodOverloading 
{
    private static void display(int a) //creating method
    {
        System.out.println("the value " + a); //printing the parameter
    }

    private static void display(int a, int b) //method overloaded (same method name diff parameters)
    
    {
        System.out.println("the values are " + a + " and " + b); //printing variables
    }
    public void display(float a , float b) //method overloaded
    {
        float c=a+b; //addition of two numbers
        System.out.println(c);
    }

    public static void main(String[] args)
     {
         MethodOverloading m = new MethodOverloading();
        display(1); //static method
        display(1, 4);
        m.display(15.65f,25.96f); //calling method by using object
    }
    
}
