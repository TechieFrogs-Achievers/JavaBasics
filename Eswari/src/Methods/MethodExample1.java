//package Methods;

//class for printing integer and character values
public class MethodExample1 
{
    //method with parameters as int and char
    public void printNumber(int number, char letter)
    {
        System.out.println("The number is  " +number);
        System.out.println("The character is  " +letter);
    }

    //method with parameters as char and int
    public void printNumber(char letter, int number)
    {
        System.out.println("The character is  " +letter);
        System.out.println("The number is  " +number);
    }

    public static void main(String[] args) {
        MethodExample1 me = new MethodExample1();       //object creation
        me.printNumber(22, 'R');                        //method calling
        me.printNumber('E', 25);
    }
    
}
