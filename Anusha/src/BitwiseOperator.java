public class BitwiseOperator
 {
     //bitwiselogical method
     public void bitwiseLogical()
     {
      int a=5;
      int b=10;
      int c=15;
      System.out.println(a>b && b<c);//false
      System.out.println(a>b & b<c);//false & true=false
      System.out.println(a>b && a++<c);//false
      System.out.println(a);//5 because second condition is not checked 
      System.out.println(a>b & a++<c);//false & true=false
      System.out.println(a);//6 because second condition is checked 

     }

     //bitwiseOr method
     public void bitwiseOr()
     {
        int a1=5;
      int b1=10;
      int c1=15; 
      System.out.println(a1>b1 || b1<c1);//true
      System.out.println(a1>b1 | b1<c1);//false & true=true
      System.out.println(a1>b1 || a1++>c1);//false
      System.out.println(a1);//6 because second condition is not checked 
      System.out.println(a1>b1 | a1++<c1);//false & true=true
      System.out.println(a1);//7 because second condition is checked 

     }

     //main method
    public static void main(String[] args) 
    {
        System.out.println("Main Method is excuted:");
        BitwiseOperator bo=new BitwiseOperator();//create object for class
        bo.bitwiseLogical();//calling method
        bo.bitwiseOr();//calling method
        
    }
}
