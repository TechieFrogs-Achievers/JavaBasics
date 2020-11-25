public class MethodExercise2
 {
     //method overloading
    public void display(int a , char c) //parameterised method
    {
        System.out.println("the integer value is :"+a); //prints the int value
        System.out.println("the character is :"+c); //prints the char
    }
    public void display(char c , int a) //parameterised method
    {
        System.out.println("the character is :"+c);
        System.out.println("the integer value is :" +a); //print the int value
    }
    public static void main(String[] args)
     {
         MethodExercise2 m = new MethodExercise2(); //creating object
         m.display('j', 7); //calling method
         m.display(4, 'h');
        
    }
}
