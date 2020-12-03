
package package1;
import Package.Interface3Package3;

public class Interface3APackage  implements Interface3Package3
{
   /* This class must have to implement both the abstract methods
    * else you will get compilation error
    */
   public void method1()   
   {
	System.out.println("implementation of method1");
   }
   public void method2()
   {
	System.out.println("implementation of method2");
   }
   public void method3()
   {
	System.out.println("implementation of method3");
   }

   public static void main(String arg[])
   {
	Interface3APackage obj = new Interface3APackage();
    obj.method1();
    obj.method2();
	obj.method3();

   }
}

    

