package StringIO;
import java.util.*;
class Area
{
    int side;
   public void area()
    {
        int mul=side*side;
        System.out.println("Area is:"+mul);
    }
}
public class StringClass3
{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int side=sc.nextInt();
       System.out.println(side);
       Area a=new Area();
       a.area();
    }
}
