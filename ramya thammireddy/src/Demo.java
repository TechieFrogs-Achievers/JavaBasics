class Average1 
{
    public void calculateAverage1(int num1,int num2,int num3)
    {
        double avg=(num1+num2+num3)/3;
        System.out.println("Average of three numbers is  "+avg);
    }
    
}
public class Demo
{
    public static void main(String args[])
    {
        Average1 a= new Average1();
        a.calculateAverage1(2,6,4);
    }
}
