class Operatorr 
{
    public void Show(int a , int b) //creating parameterised method
    {
        System.out.println(a+b);
    }
    public void Show(String a , String b) //overloading
    {
        System.out.println(a+b); //prints the concatination of two strings
    }
    public void Show(int a , int b , int c) //method overloading
    {
        System.out.println(a+b+c); //prints the addition of three values 
    }
}
public class OperatorOverloading
 {
     public static void main(String[] args)
      {
          Operatorr o = new Operatorr(); //creating object
          o.Show(4, 5);
          o.Show("Jameema", "Bandaru"); //calling method
          o.Show(4,5,6);
         
     }
    
}
