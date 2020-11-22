class AddDistance
{
    int inches1,inches2,feet=0;
    public void displayDetails(int in1,int in2)
    {
        inches1=in1;inches2=in2;
        int inches=inches1+inches2;
        int diff=inches-12;
        if(inches>=12)
        {
             feet++;
            System.out.print("feet="+feet++);
            System.out.print(diff+"inches");
            
        }
    }
}

public class Distance 
{
   public static void main(String[] args) 
   {
      AddDistance ad=new AddDistance();
      ad.displayDetails(12, 5);
   } 
}
