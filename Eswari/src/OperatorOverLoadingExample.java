//class for operator Overloading
class Operator
{
    //method for adding two numbers 
    static void add(int a, int b)
    {
        System.out.println("The sum is " +(a + b));
    }
    //method for string concatination
    static void add(String str1, String str2)
    {
        System.out.println("String Concatination is " +(str1 + str2));
    }
    //int ansd string method
    public void add(int a, String str)
    {
        System.out.println("Contatination is " +(a + str));
    }
    // static void add(char a, char b)
    // {
    //     System.out.println("Character  concatenation is " +(char)(a + b) );
    // }
}

public class OperatorOverLoadingExample 
{
    public static void main(String[] args) {
         Operator o = new Operator();
        Operator.add(5, 4);
        Operator.add("2", "eswari");
        Operator.add("Eswari", " Diddi");
        Operator.add("Rama" , "Eswari");
        // Operator.add('e', 's');
        o.add(5, "Eswari");
    }
    
}
