public class Swaping 
{
    public static void main(String[] args)
    {
        int val=10,var=20;
         System.out.println("--Before swap--");
        System.out.println("First number = " + val);
        System.out.println("Second number = " + var);
    
         int temp=val;
         val=var;
         var=temp;
         System.out.println("after swapping :");
         System.out.println("First number = " + val);
        System.out.println("Second number = " + var);
    }
}
