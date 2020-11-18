class Sample
{
    void Uniary()
    {
        int a=10;
        boolean b=true;
        System.out.println("the value of a :"+a); //10
        System.out.println("the post increament value:" +a++); //10
        System.out.println(" the pre increament value:" + ++a); //12
        System.out.println("the pre decreament value" +--a); //11
        System.out.println("the post increament value:" +a--); //11
        System.out.println (a++ + ++a); //(10+12=22)
        System.out.println (--a - a--); //(11-11=0)
        System.out.println (a++ - ++a); //(10-12=-2)
        System.out.println (a++ + --a); //(12+12=24)
        System.out.println (!b); //false
        System.out.println (~a); //(-13)

    }

    void Binary()
    {
        int x=10;
        int y=20;

        //Arthimetic operator
        {
            int add=x+y;
            System.out.println ("the addition of two numbers is: " +add); //30
        }
        {
            int  sub=x-y;
            System.out.println ("the substraction of two numbers is: " +sub); //-10
        }
        {
            int mul=x*y;
            System.out.println ("the multiplication of two numbers is: " +mul); //200
        }
        {
            int div=x/y;
            System.out.println ("the division of two numbers is: " +div); //0
        }
        {
            int module=x%y;
            System.out.println ("the module of two numbers is: "  +module); //10
        }

        //Relational operator

        {
            System.out.println ("x is lesstha y :" +(x<y));
            System.out.println ("x greaterthan y:" +(x>y));
        }
        {
            int leftshift=x<<y;
            System.out.println ("the value is :" +leftshift); //(10*2^20=10485760)
        }
        {
            int rightshift=x>>y;
            System.out.println ("the value is :" +rightshift); //(10/2^20=0)
        }

        //Logical and Bitwise

        {
            int z=139;

            System.out.println (x<y && y<z); //(true&&true=true)
            System.out.println (x>y & y<z); //(false&true=false)
            System.out.println (x<y || y<z); //(true||trur=true)
            System.out.println (x<y | y<z); //(true|true=true)
            System.out.println (x<y && ++y<z); //(true&&true=true)
            System.out.println (x>y | y>z++); //(false|false=false)
        }
    } 

    void Ternary()

     //ternary operator

    {
        int j = 45;
        int k = 35;
        int val = (j<k)?j:k;
        System.out.println(val);


        //Assignment operator

        System.out.println (j+=5); //(45+5=50)
        System.out.println (k-=j); //(35-50=-15)
    }
    
}

public class Operators
 {
     public static void main(String[] args) 
     {
         Sample s = new Sample();
         s.Uniary();
         s.Binary();
         s.Ternary();
         
     }
    
}
