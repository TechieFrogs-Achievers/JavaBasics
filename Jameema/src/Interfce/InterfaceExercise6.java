package Interfce;
interface KidsWear //interface
{
    public void Boys(String a , String b); //abstract method
    public void Girls(String a , String b);
}
interface WomensWear
{
    public void Ladies(String a , String b);
    public void Womens(String a , String b); //abstract method
}
interface MensWear
{
    public void Gents(String a , String b); //abstract method
    public void Mens(String a , String b);
}
interface Shopping extends KidsWear,WomensWear,MensWear //it inherits all the 3 interface details
{
    public void Cart(String Item);
} 


public class InterfaceExercise6 implements Shopping //it implements the Shopping interface details
{
    public void Boys(String a , String b) //implementing abstract method
    {
        String item = a; //assigning the parameter to variable
        System.out.println(item);   
    }
    public void Girls(String a , String b)
    {
        String item = b;
        Cart(item); //cart is method which displays the result of girls method items
    }
    public  void Ladies(String a , String b)
    {
        String item = b;
        System.out.println(item); //it prints the ladies items
    }
    public void Womens(String a , String b)
    {
        String item = a;
        Cart(item); //cart is method which displays the result of Womens method items
    } 
    public void Gents(String a , String b)
    {
        String item = b;
        System.out.println(item);
    }
    public void Mens(String a , String b)
    {
        String item = a;
        Cart(item); //cart is method which displays the result of Mens method items
    }

    public void Cart(String item)
    {
        System.out.println("the item is : " +item); //it displays the items of different methods
    }
    public static void main(String[] args)
     {
         InterfaceExercise6 i = new InterfaceExercise6(); //creating object
         i.Boys("BabySuits", "Babykit"); //passing values to the methods
         i.Girls("Baby froks", "Baby angelPack");
         i.Ladies("kurtis", "jean tops");
         i.Womens("sarees", "Lehanga choli"); //calling method by using object
         i.Gents("T-shirts", "Hoodies" );
         i.Mens("Sherwani", "Kurtasalwar");
         
        
    }
    
}
