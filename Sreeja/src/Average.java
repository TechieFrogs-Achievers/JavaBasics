import java.util.Scanner;

public class Average 
{
    
    public void average(float firstNumber,float secondNumber,float thirdNumber) //method to calculate average
    {
        float average = (firstNumber+secondNumber+thirdNumber)/3;
        System.out.println(average); 
    }
     public static void main(String[] args) 
     {
        
        Scanner s = new Scanner(System.in);   //scanner for entering the values by the user
        float a = s.nextFloat();
        float b = s.nextFloat();
        float c = s.nextFloat();
        
        s.close();

        Average av = new Average();     //creating object
        av.average(a,b,c);      //method calling
        
        
    } 
}
