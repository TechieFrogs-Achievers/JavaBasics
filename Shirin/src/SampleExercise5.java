class Typepromotion
{   
    // creating method
    public void display(int a, float i)//two data types
    {
        System.out.println(" first method is passed");
    }
      public void display(int a , double j ,double k)
    {
        System.out.println(" second method is passed");
    }
    /*public void display (char c , int a , float i, int b)
    {
        System.out.println(" Third method is passed");
    }*/
    
}
public class SampleExercise5
{
    public static void main(String[] args) 
    {   
        // creating object
        Typepromotion t = new Typepromotion();
        // calling method
        t.display(55, 16.101f);
        //t.display('s',55,12.00f,25 );
        
    }
} 
