public class Unary1 {
    public static void main (String args[])
    {

int a=30;  
int b=40;  
System.out.println(a++ + ++a + ++a + a++);// 30+32+33+33
System.out.println(b++ + b++ + ++b + ++b);// 40+41+43+44

int e=10;  
int f =-10;  
boolean c=true;  
boolean d=false;  
System.out.println(~e);//-11 (minus of total positive value which starts from 0)  
System.out.println(~f);//9 (positive of total minus, positive starts from 0)  
System.out.println(!c);//false (opposite of boolean value)  
System.out.println(!d);//true 





    }
    
}
