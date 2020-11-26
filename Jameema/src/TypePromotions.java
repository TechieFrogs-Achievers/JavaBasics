public class TypePromotions 
{
    public void promotion(int i , float j)
    {
        System.out.println("the add of two num " +(i+j));
    }
    public void promotion1(long x , double y)
    {
        System.out.println("convert " + x + " to " + y);
    }
    public static void main(String[] args)
     {
        int a=920; //int value
        long b=a; //assigning int value as long 
        double c=a; // assigning int value as double 
        System.out.println("the integer value :" +a); //prints the integer value
        System.out.println("the long value :"+b); // prints the long value
        System.out.println("the double value :"+c); //prints the double balue
        TypePromotions t = new TypePromotions();
        t.promotion(25, 98.32f);
        t.promotion1(9655667, 96587);

        
    }
    
}
