public class Area7
 {
    
    int l,b;    //defining variables
    
    Area7(int length,int breadth)       //parameterized constructor
    {
        l=length;
        b = breadth;
    }
    public int returnArea()     //method to calculate area
    {
        int area = l*b;
        return area; 
    }
     public static void main(String[] args)
      {
        Area7 ar = new Area7(5,5);      //creating object for class area
        
        System.out.println(ar.returnArea()); //printing the area

        
    }

}
