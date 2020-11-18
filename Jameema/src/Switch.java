public class Switch
 {
     public static void main(String[] args) 
     {
         int a=10 , b=30;
         int c;
         int n=3;
         switch(n)
         {
         case 1:
         c=a+b;
         System.out.println("additon of two numbers" +c);
         break;
         case 2:
         c=a-b;
         System.out.println("substraction of two numbers" +c);
         break;
         case 3:
         c=a*b;
         System.out.println("multiplication of two numbers" +c);
         break;
         case 4:
         c=a/b;
         System.out.println("division of two numbers" +c);
         default:
         System.out.println("no operation is performed");
         }    
     }
    
}
