class AddDistance
{
    int inches1,inches2,feet=0;
    public void displayDetails(int in1,int in2)
    {
        inches1=in1;inches2=in2;
        int inches=inches1+inches2;
        //total distance
        if(inches>=12)
        {
             feet++;
             inches=inches-12;
        }
        System.out.print("distance="+feet++ +"feet"+" "+inches+"inches");
            
    }
}

public class Distance 
{
   public static void main(String[] args) 
   {
      AddDistance ad=new AddDistance();//create object
      ad.displayDetails(12, 5);//assign values
   } 
}
