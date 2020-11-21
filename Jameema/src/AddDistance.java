public class AddDistance 
{ 
   public void Distance(int inch1 , int inch2 , float feet1 , float feet2)
   {
       int inches=inch1+inch2;
       float feet = feet1+feet2;
       if(inches>12)
       {
           feet++;
           inches=inches-12;
       }
       System.out.println("inches: "+ inches + "  feet: "+feet);
   }
   public static void main(String[] args)
   {
       AddDistance d = new AddDistance();
       d.Distance(8,9,10,11);
       
   }
    
}
