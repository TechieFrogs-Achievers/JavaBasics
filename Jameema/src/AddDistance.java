public class AddDistance 
{ 
   public void Distance(int inch1 , int inch2 , float feet1 , float feet2) //parameterized method
   {
       int inches=inch1+inch2;
       float feet = feet1+feet2;
       if(inches>12)
       {
           feet++; //increment feet
           inches=inches-12; 
       }
       System.out.println("inches: "+ inches + "  feet: "+feet); //printing inches and feet
   }
   public static void main(String[] args)
   {
       AddDistance d = new AddDistance(); //creating object to class
       d.Distance(8,9,10,11); //calling method using object
       
   }
    
}
