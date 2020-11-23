public class Area 
{
    int a;                //defining data members
    int b;                  

    public void setDim(int length,int breadth)  //method for assigning the values
    {
       a = length;
       b = breadth; 
    }

     int getArea()          //method to calculate area
    {
        int area = a*b;
        return area;
    }
    public static void main(String[] args) 
    {
        Area A1 = new Area();    //creating object for class area
        
        A1.setDim(8,9);     //method calling
        
        System.out.println(A1.getArea());   //printing the area by accessing method with object
    }
    
}
