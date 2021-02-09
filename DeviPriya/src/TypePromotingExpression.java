public class TypePromotingExpression {
     
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
    
      }  public static void main(String[] args) 
    {
        TypePromotingExpression tp=new TypePromotingExpression();
        tp.promotion();//method calling
    }
    
}
