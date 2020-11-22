public class AddDistance 
{
    int feet;       //defining data members
    int inches;

    public void totalDistance(int inches1,int feet1,int inches2,int feet2 )     //method to calculate totaldistance
    {
		inches = inches1+inches2;
		feet = feet1+feet2+(inches/12);
		inches = inches%12;
    }
    
    public void display()       //method to print the output
    {
        System.out.println(feet+"feets "+inches+"inches");
    }

    public static void main(String[] args)
     {
         AddDistance Ad = new AddDistance();    //creating object 

         Ad.totalDistance(7,5,6,7);     //method calling
         Ad.display();
        
    }
}
