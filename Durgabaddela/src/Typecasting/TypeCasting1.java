package Typecasting;

public class TypeCasting1
{
    public static void main(String[] args) 
    {
        double num = 10.6;
       int num1  = (int) num;//narrow type casting
      System.out.println(num); //printing the double value  
       System.out.println(num1);//printing the integer value

       int n = 23;
       double number = n;//normal type casting it will executes automatically
       System.out.println("integer value ="+n);//printing the interger values
       System.out.println("Double value="+number);//printing the double value
    }
}
