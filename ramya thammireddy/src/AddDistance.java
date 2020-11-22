public class AddDistance 
{
    void distance(int inch1,int inch2,float feet1,float feet2)
    {
        int inches=inch1+inch2;
        float feet=feet1+feet2;
        if (inches>10)
        {
            feet++;
            System.out.println("inches:"+inches+"feet:"+feet);
        }

    }
    public static void main(String args[])
    {
        AddDistance ad=new AddDistance();
        ad.distance(6,7,3,6);
    }
}
