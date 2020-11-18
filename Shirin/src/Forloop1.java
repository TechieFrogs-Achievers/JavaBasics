public class Forloop1 
{
    public static void main(String[] args)
    {
        int num = 5;
        int n =  6;
        for ( int i = n; i >=num; i++  )
        {
            num = num* i;//30
            System.out.println("the value is :"  + num);
            num = num + i; //36
            System.out.println(" the num value is " + num);
               
        }
    

        
    }
    
}
