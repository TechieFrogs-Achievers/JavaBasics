public class ExceptionHandling8 
{
    static void validate(int age)//methode
    {
        if(age>18)//throw key using in exception
         throw new ArithmeticException("get voit");
         else
         System.out.println("new voit");
    }

public static void main(String[] args) 
{
    validate(13);
    System.out.println("rest of code...");
}
}
