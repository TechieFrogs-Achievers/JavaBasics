 class Accessmodifiers1 
{
    int a;
    int b;
    // using private 
      private void Add()
    {
         a = 5;
         b = 9;
         int c = a+b;// Assigning two variables into c
        System.out.println("c is " + c);// it print c valuea 

    }
     // private modifier is not declare
    void sub()
    {     
         a = 5;
         b = 7;
         int c = a-b;//Assigning two variables into c
         System.out.println(" c is : " + c);
    }

}
// main class
class Private 
{   

    public static void main(String[] args)
    {
        Accessmodifiers1 p = new Accessmodifiers1();
        //p.Add();
        p.sub();

        
    }
}
    

