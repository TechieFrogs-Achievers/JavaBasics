public class IAndJ 
{
    public static void main(String[] args) 
    {
       A obj1=new A();// a class A
       B obj2=new B();// a class B
       A.relation();//c method
       B.relation();//method
       A obj=new B();
    } 
 }
 class A
 {
     //satic method to print parent
     public static void relation()
     {
         System.out.println("parent");
     }
 }
 class B extends A
 {
     //satic method to print child
     public static void relation()
     {
         System.out.println("child");
     }
}
