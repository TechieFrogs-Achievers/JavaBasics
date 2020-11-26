public class TypePromotion1 
{
    void sum(int a, float b) //method for class  coverting int to float
    {
        System.out.println("Addition of 2 integer:"+(a+b));
    }
    void  show(long l, double d) // method overload converting  long into double
    {
        System.out.println("convert:"+l+" "+d);

    }
    void show(char c , int a) // converting character to integer
    {
        System.out.println("covert:"+c+" "+a);
    }
}
class TypePromotion2
{
    public static void main(String[] args)
     {
         TypePromotion1 tp=new TypePromotion1(); //object creation for class 
         tp.show(19,18); //  calling method with object from class 
         tp.show(14222,4522); // calling method with object from class
         tp.show('1',2);// calling method with object from class
        
    }
}
