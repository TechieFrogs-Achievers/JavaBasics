public class Conversion2 
{
    public static void main(String[] args) 
    {
        int sample = 55;        //initialize the values
        
        //converting int to string

        String s = Integer.toString(sample); 
        String s1 = String.format("%d",sample);
       
        //print the values

        System.out.println(s);
        System.out.println(s1);
    }
}
