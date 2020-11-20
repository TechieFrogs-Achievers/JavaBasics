public class MethodsExamples 
{
    //method

    public void display() // without returntype and without parameters
    {
        System.out.println( " Java programming ");
    }


    // instance method

    public int add( int a , int b) // method with int return type and having parameters 
    {
       return a+b ;



    }


    // method with return type flaot 

    public float sub( int x , int y)
    {
        return x-y;

    }

    // static method 


    static void work() // we can call this method directly 
    {
        System.out.println("!!! Total work Done !!!!");
    } 


    public static void main(String[] args) 
    {
        //object creation 

        MethodsExamples method = new MethodsExamples();
        method.display(); // display method call
        int c =  method.add(2 , 3); // add method call
        System.out.println( "sum is c = " + c);
        float z = method.sub(10 , 5);
        System.out.println(" subtraction is z = " + z );
        work(); // static method call
    }
}
