public class IfExercise
 {
     int x=100560;
     int y=248565;
     String name="java";
     boolean z=false;
     char charLet='s';
     byte a=32;
     float cost=678.98f;
     int h;
     public void Sample()
     {
         if((h=x+y)>15690)
         {
             System.out.println("the value is morethan x :" + h);
         }
         if(name == "java")
         {
             System.out.println("java is trending language");
             if(cost == 678.98f)
             {
                 System.out.println("the java book cost " +cost);
             }

         }
         if (z = true)
         {
             System.out.println("the given boolean statement is wrong");
         }
         if(a==67)
         {
             System.out.println(a);
         }

     }
     public static void main(String[] args)
      {
          IfExercise i = new IfExercise();
          i.Sample();
          System.out.println("if condition is fails out side of block");
         
     }
    
}
