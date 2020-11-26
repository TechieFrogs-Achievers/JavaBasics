public class TypePromotion 
{
    public void sub(int a,int b) //creating method by using same type of parameters
    {
        System.out.println("It is substraction:");
    }
    public void sub(int a,double b,long c)
    {
        System.out.println(a-b-c);   //perfroms the subtraction
    }
    public void sub(short q,byte r,double l)   //creating method by using different datatypes
    {
        System.out.println(q-r);
    } 
    public static void main(String[] args)
     {
         TypePromotion t = new TypePromotion();   //creating object for the parent class
         t.sub(20,30);
         t.sub(20,40000,500); //assinging the values to the method
         t.sub(75,80,24);
        
    }
    
}
 