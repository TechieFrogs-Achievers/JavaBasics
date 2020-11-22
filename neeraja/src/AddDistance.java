public class AddDistance
 {
     int feets;
     double inches;
     public AddDistance(int feets, double inches) 
     {
      this.feets=feets;
      this.inches=inches;
     }

     private void distance(AddDistance D1, AddDistance D2)
    {
        double inch=(D1.inches+D2.inches);
        double feet=(D1.feets+D2.feets+(inch/12));
        inch=(inch%12);

        System.out.println("adition of two distances is: "+feet +"feet "+inch+"inches");
    }

     public static void main(String[] jn)
     {
         AddDistance D1=new AddDistance(14,5.2);
         AddDistance D2=new AddDistance(32,9);
         D1.distance(D1,D2);
     }

    
     
     
    
}
