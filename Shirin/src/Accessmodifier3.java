public class Accessmodifier3 
{
    int sum1;
    int sum2;
    // using protected modifier
    protected void Add( int x , int y)
    {
        int z = x + y;//adding two values '+' to z
        System.out.println("the add of sum value is: " +z);
    }
     void multi( int x , int y)
    {
        int z = x * y;//adding two values '*' to z 
         System.out.println(" the multi of sum value is: " +z);
    }

    public static void main(String[] args)
    {
        Accessmodifier3 a = new Accessmodifier3();
        //values assigning x ,y
        a.Add(2 ,6);
        a.multi(6 ,5); 
            
        

        
    }
    
}

