public class Unary
{
    public static void main(String[] args)
    {
        
        int a=20;
        boolean b=true;
        System.out.println("the value of  a :"+a); //20
        System.out.println("the post increment value value :"+a++); // 20
        System.out.println("the pre increment value :"+ ++a); //22
        System.out.println("the pre increment value :"+ --a); //21
        System.out.println("the post increment value :"+ a--); // 21
        System.out.println(a++ + ++a); //(20+22=44)
        System.out.println(--a - a--);//(21-21=0)
        System.out.println(a++ - ++a);//(20-22=-2)
        System.out.println(a++ + --a);//(22+22=44)
        System.out.println(!b);//(false)
        System.out.println(~a);
    }

    
    
}


     


