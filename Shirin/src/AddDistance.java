public class AddDistance 
{
     void distance ( int inch1 , int inch2, double feet1, double feet2)
     {
         int inches = inch1 + inch2;
         double feet = feet1 + feet2;
         if ( inches>12)
         {
             feet++;
             inches= inches-12;
         }
         System.out.println("inches =" + inches + "    "+ "feet =" + feet);

    }
    public static void main(String[] args)
    {
        AddDistance d = new AddDistance();
        d. distance(6 , 12 , 20 , 25);
        
    }
    
}
