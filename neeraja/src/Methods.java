 class Test
{

        //method to find even number
    public void findEvenNumber(int number) 
    {
        //body of method
        if(number%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("given no is odd number");
        }
    }

       //method to swap entered digits
     public static int swap()
    {
        //body of methodss
        int temperory;
        int x=10, y=20;
        temperory=x;
        x=y;
        y=temperory;
        return x;
    }
       //method overloading
    public void findEvenNumber(int c,int d)
    {
        System.out.println(c+" "+d);
    }
}

class Methods
{
    public static void main(String[] args)
    {
        //creation of object
     Test t=new Test();
     int digit=10;

       //method calls
      t.findEvenNumber(digit);
      t.findEvenNumber(3,5);
      int b=Test.swap();

      System.out.println("The maximum number is: " + Math.max(9,7));
      System.out.println(b);
      
    }
}