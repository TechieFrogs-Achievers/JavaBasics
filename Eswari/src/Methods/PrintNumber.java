//package Methods;

//class for printing different values with taking different datatypes
class PrintNumber
{
    //method as integer type parameter
    public void printn(int number1)
    {
        System.out.println("The number value :" +number1);
    }

    //method as string type parameter
    public void printn(String name)
    {
        System.out.println("Name :" +name);
    }

    //method as boolean type parameter
    public void printn(boolean val)
    {
        System.out.println("Boolean value :" +val);
    }

    //method as float and double type parameters
    public void printn(float number2, double number3)
    {
        System.out.println("Float :" +number2);
        System.out.println("Double :" +number3);
    }

    public static void main(String[] args) {
        PrintNumber pn = new PrintNumber();         //object creation
        //methods calling
        pn.printn(25);                                          
        pn.printn("eswari");
        pn.printn(true);
        pn.printn(25.23f, 531.2549);
    }

    
    
}
