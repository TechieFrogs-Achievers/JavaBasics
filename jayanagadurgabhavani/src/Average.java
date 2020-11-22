public class Average 
{
    public void calculateAverage(int number1, int number2, int number3)
    {
      // average farmula  
    //Add the numbers: 566 + 552 + 528 = 1646
    //Divide by how many numbers (there are 3 numbers): 1646 / 3 = 548


        double avg= (number1 + number2 + number3)/3;
        System.out.println("Average og three numbers is  "+avg);
    }

    public static void main(String[] args) 
    {
        Average a= new Average();
        a.calculateAverage(566, 552,528);
    }
}
