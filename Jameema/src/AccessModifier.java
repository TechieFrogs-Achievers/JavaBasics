public class AccessModifier
 {
     public AccessModifier()
     {
         System.out.println("public constructor");
     }
     private AccessModifier(int x)
     {
         System.out.println("Private constructor and value is:" +x);

     }
     protected AccessModifier(String b)
     {
         System.out.println(b);
     }
     public static void main(String[] args) 
     {
         new AccessModifier();
         new AccessModifier(5);
         new AccessModifier("protected");
         
     }
    
}
