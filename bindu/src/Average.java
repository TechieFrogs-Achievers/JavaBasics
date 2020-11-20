public class Average {
    public void Threenumbers(int num1, int num2,int num3)
    {
        double avg=(num1+num2+num3);
        System.out.println("Average of three numbers is:" +avg);
    }
public static void main(String[] args) 
{
    Average a=new Average();
    a.Threenumbers(3,4,6);
}

}
