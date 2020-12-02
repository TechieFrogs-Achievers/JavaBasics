package Interface;

interface Values 
{
    static char ch='A';  //assigning the value to the static keyword 
    static int i =87;
    final double d = 543567.87;   //value to the final 
    final float f = 65.4345f;
}
public class Fields implements Values     //class implements the interface 
{
    public static void main(String[] args) 
    {
        System.out.println("The value of static is :"+ch);   //prints the value of satic char
        System.out.println("The value of int is:"+i);
        System.out.println("The value of double is:"+d);
        System.out.println("The value of float is:"+f); //prints the value of final
        
    }
}