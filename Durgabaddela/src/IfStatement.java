public class IfStatement
{
 public static void main(String[] args)
{
    int number=10;
    String month="december";
    short a=10,b=20;
    boolean c;
    double d=4.2;
    char ch='e';
   /*if(number < 100)//1
    {
        System.out.println("number is less than 100");
    }*/
   /* if(month == "december" || month == "january")//2
    {
        System.out.println("this is winter season");
    }*/
    if(month == "december" && month == "january")//3
    {
        System.out.println("winter season");
    }
    if(a < b)//4
    {
        System.out.println("b is higher value");
    }
    if(-a > b)//5
    {
        System.out.println(" a is higher value");
    }
    if(-a != b)//6
    {
        System.out.println(" a and bvalues are not equal");
    }
    if(c = 10 == 12)//7
    {
        System.out.println(c);
    }
    if(c = 5 != 2)//8
    {
        System.out.println(c);
    }
    if(d%2 == 0.0)//9
    {
        System.out.println(" d is an even number");
    }
    if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
    {
        System.out.println(" vowel");
    }

    
    
}
}