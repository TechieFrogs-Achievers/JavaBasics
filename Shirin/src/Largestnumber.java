public class Largestnumber 
{
    public static void main(String[] args) 
    {
        int s1 = 25;
        float s2 = 12.05f;
        double s3 = 14.900d;//250.39d

        if ( s1 > s2 && s1 >  s3)
        {
            System.out.println(" s1 is the largest number " + s1);
        }
        else  if ( s2 > s1 && s2 > s3)

        {
            System.out.println(" s2 is the largest number " + s2);
        }
        else 
        {
            System.out.println(" s3 is the largest number  " + s3);
        }
        
    }
    
}
