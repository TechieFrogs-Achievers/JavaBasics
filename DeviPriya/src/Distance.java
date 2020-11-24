 class AddDistance1 
{
    int inches1,inches2,feet;
     public void displayDetails(int in1,int in2)
    {
        inches1=in1;inches2=in2;
        int inches=inches1+inches2;
        int diff=inches-12;
        //total distance
        if(inches>=12)
        {
             feet++;
            System.out.print("feet="+feet++);
            System.out.print(diff+"inches");

             inches=inches-12;
        }
        System.out.print("distance="+feet++ +"feet"+" "+inches+"inches");

    }
}

public class Distance 
{
public static void main(String[] args) 
   {
      AddDistance1 ad=new AddDistance1();
      ad.displayDetails(12, 5);
      AddDistance1 ad1=new AddDistance1();//create object
      ad1.displayDetails(12, 5);//assign values
   } 
}


