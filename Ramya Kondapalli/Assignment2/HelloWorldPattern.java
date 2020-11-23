public class HelloWorldPattern 
{
    public static void main(String[] args)
    {
        //intialising strings
        String s1= "HELLO",s2= "WORLD";
            
            for(int j=5,i=0;i<=6;i++,j--)
            {
                System.out.println();
                //pritning 'hello' , 'world'  using subString method
                System.out.print(s1.substring(0,i+1) + " "+ s2.substring(0,j));
            }
    }
}
