public class Average 
{
    int num1,num2,num3;
    Average(int n1, int n2,int n3)
    {
        num1=n1;
        num2 = n2;
        num3= n3;
    } 
    public void calculate() //method to claculate average of three numbers 
    { 
        double avg = (num1+num2+num3)/3;
        System.out.println( "average of three numbers =" + avg);

    } 
    public static void main(String[] args) 
    {
        Average av = new Average(4, 5, 6);
        av.calculate();
        
    }
    
}
