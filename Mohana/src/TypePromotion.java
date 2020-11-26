class Automatic 
{
    public void display(int a , double b) //method to display 
    {
        System.out.println("multiplication of numbers : " +(a*b));
    } 

    public void display2( double x , long y)//method to display addition value 
    {
        System.out.println(" addition of two numbers is : "+(x+y));
    }
}
public class TypePromotion 
{
    public static void main(String[] args) 
    {
       Automatic at = new Automatic(); 
       
       //automatic type promotiom is done

       at.display(2,2);   //here 2 is automatically converted into double  
       at.display2(1,2l); //here 1 is converted into  converted into double  
    }
    
}
