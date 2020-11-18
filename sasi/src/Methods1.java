public class Methods1
{

    public void add (int a, int b) // method  with paramters 

   {

        int c=a+b; //Addition of two numbers
         System.out.println("the addition of two numbers is:"+c);//40

   }
     public void div () //method without parmeters
   {

        int x=10;
        int y=10;
       System.out.println(x/y); //divison of two numbers   

   }  


        public static void main(String args[])
    {

        Methods1 met=new Methods1();
        met.add(10,30);//40
        met.div();//1

    }


}
