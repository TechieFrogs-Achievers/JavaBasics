public class NestedIf
 {
     public static void main(String[] args) 
     {
         int a=3;
         int b=3;
         int c=3;
         int age=5;
         String name="chotu";
         if(a==b)
         {
             if(b==c)
             {
             System.out.println("the three values are equal");
             }
             
         }

         if (age>0)
         {
             if(age<10)
             {
                 System.out.println("the value is between 0 and 10");
             }
             else 
             {
                 System.out.println("the values is not between 0 and 10");

             }
         }
         if(age>0)
         {
             if(name == "bannu")
             {
                 System.out.println("chotu age : " +age);
             }
             else
              {
                  System.out.println("dosent exit");

             }
         }
         
     }
    
}
