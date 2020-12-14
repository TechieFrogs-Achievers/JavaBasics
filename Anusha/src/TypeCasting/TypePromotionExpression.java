package TypeCasting;

public class TypePromotionExpression 
{
    void promotion()
    {
        byte b=45;
        char ch='a';
        short s= 12;
        int i=b;
        float f=i;
        double d=10.22355;
        double result=(f*b)+(i/ch)-(d*s);
        System.out.println("Result = "+result);
    }
    public static void main(String[] args) 
    {
        TypePromotionExpression tp=new TypePromotionExpression();
        tp.promotion();//method calling
    }
}
