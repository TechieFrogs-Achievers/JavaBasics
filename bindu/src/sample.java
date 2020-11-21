 class marks {
    int s1;
    int s2;
    protected void multiplication(int a,int b)
    {
        s1=a;
        s2=b;
        int d=s1-s2;
        System.out.println("the subtraction of num" +d);
    }   
    marks(int a,int b)
    {
        s1=a;
        s2=b;
        int d=s1+s2;
        System.out.println("the addition of num" +d);
    } 
}
public class sample
{
    public static void main(String[] args) 
    {
        marks m = new marks(12,5);
        //m.multiplication(8,2);
    }

    
}
