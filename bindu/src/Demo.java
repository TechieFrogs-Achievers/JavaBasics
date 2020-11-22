class privatespecifier
{
    int s1;
    int s2;
    private void multiplication(int a,int b)
    {
        s1=a;
        s2=b;
        int d=s1*s2;
        System.out.println("the multiplication of num" +d);
    }   
    privatespecifier(int a,int b)
    {
        s1=a;
        s2=b;
        int d=s1+s2;
        System.out.println("the addition of num" +d);
    } 
}
public class Demo
{
    public static void main(String[] args) 
    {
        privatespecifier p = new privatespecifier(3,6);
        //p.multiplication(7,5);
    }

}



