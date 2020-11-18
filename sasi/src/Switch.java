public class Switch 
{
    public static void main(String[] args)
     {
          int number = 44;
          String len;
          switch (number) 

          {
               case 29:
               len = "Small";
               System.out.println("length:"+len);
               break;
               
               case 42:
               len = "Medium";
               System.out.println("length:"+len);
               break;
               
               case 44:
               len = "Large";
               System.out.println("length:"+len);
               break;

               default:
               System.out.println("no size");


             }
     }
}
