//average class is created for calculating average of three numbers 
class Average
{
    //method creation
    public void calculateAverage(int number1, int number2, int number3)
    {
        double avg= (number1 + number2 + number3)/3;   //formula for average
        System.out.println("Average og three numbers is  "+avg);
    }
}

public class ClassesAndObjectsProgram8 {
    public static void main(String[] args) {
        Average a= new Average();  //object creation
        a.calculateAverage(5, 4, 6);  //passing values to method
    }
    
}
