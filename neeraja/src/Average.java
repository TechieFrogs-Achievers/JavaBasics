import java.util.*;
public class Average 
{
    //declaring variables
    float firstNumber;
    int secondNumber;
    char thirdNumber;

    //method to calculate and print average of no's
    public void average(float firstNumber,int secondnumber,char thirdNumber)
    {
        double avgerageOfNum=(firstNumber+secondNumber+thirdNumber)/3;
        System.out.println(avgerageOfNum);
    }

    public static void main(String[] fv)
    {
    
    //Scanner class to take input from user
    Scanner sc=new Scanner(System.in);

     //taking inputs from keyboard
     System.out.println(" enter 1st number: ");
     float numberOne=sc.nextFloat();
     System.out.println(" enter 2nd number: ");
     int numberTwo=sc.nextInt();
     System.out.println(" enter 23rd number: ");
     char numberThree=sc.next().charAt(0);

     //creation of object for the class average
     Average avenumber=new Average();

     //method call passing required no's
     avenumber.average(numberOne,numberTwo,numberThree);
     

    }
    
}
