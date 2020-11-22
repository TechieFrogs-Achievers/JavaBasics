public class Triangle 
{
    int s1;
    int s2;
    int s3;
     double Area()
        {
            double s = (s1+s2+s3)/2;
            return  Math.pow((s*(s-s1)*(s-s2)*(s- s3)), .5);
        }
        double perimeter ()
        {
            return (s1+s2+s3)/2;
        }
}

    
class Calling
{
    public static void main(String[] args)
    {
        Triangle  c = new Triangle ();
        c.s1 = 5;
        c.s2 = 5;
        c. s3 = 5;
        System.out.println( c. Area());
        System.out.println( c. perimeter());

        
    }
}



    

