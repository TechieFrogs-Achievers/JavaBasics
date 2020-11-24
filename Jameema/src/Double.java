 class VariableMethod
{
    int val=456; //instance variable
    static int num=6787; //static variable
    void Demo()
    {
        int a=45; //local variable
        int b=35;
        int c=a+b;
        System.out.println(c);
    }
}
public class Double extends VariableMethod
 {
     public static void main(String[] args)
      {
         int cal=894; //instance variable
         System.out.println(cal); // printing instance variable
         System.out.println(num); //printing static variable
         VariableMethod t = new VariableMethod(); //creating object to class
         t.Demo(); //calling method by using object
         System.out.println(t.val); //calling instance variable by using object
     }   
}
