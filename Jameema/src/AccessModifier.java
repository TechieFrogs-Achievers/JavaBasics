public class AccessModifier
 {
     public AccessModifier()
     {
         System.out.println("public constructor"); //using public modifier
     }
     private AccessModifier(int x)
     {
         System.out.println("Private constructor and value is:" +x); //using private modifier

     }
     protected AccessModifier(String b) //using protected modifier
     {
         System.out.println(b);
     }
     public static void main(String[] args) 
     {
         new AccessModifier(); //by using new keyword we are calling constructor
         new AccessModifier(5);
         new AccessModifier("protected");
         
     }
    
}
