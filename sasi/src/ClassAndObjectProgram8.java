class Average2
 {
    public void calculateAverage(int num1,int num2,int num3)
    {
        double avg=(num1+num2+num3)/3;
        System.err.println("Average of three numbers"+avg);
    }
}
public class ClassAndObjectProgram8
{
    public static void main(String[] args) 
{
    Average2 a=new Average2();
    a.calculateAverage(1,2,3);
}
}
