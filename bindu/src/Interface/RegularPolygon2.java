package Interface;

interface RegularPolygon2
{
    static int totalsides(int sum)  //using the static 
    {
        return sum;  //returns the sum
    }
    class EquilateralTriangle2 implements RegularPolygon2    //subclass inherits the parent class
    {
        public int getNumsides()    //creating the method
        {
            return(3);
        }
    }
    class Square1 implements RegularPolygon2
    {
        public int getNumsides()
        {
            return(4);   //returns the sides
        }
    }
        public static void main(String[] args)
     {
         EquilateralTriangle2 e = new EquilateralTriangle2();  //creating the object for the subclass
         System.out.println("the equilateraltriangle of side is:"+e.getNumsides());
         Square1 s = new Square1();  //creates the object for subclass2
         System.out.println("the square of side is:"+s.getNumsides());
         int sum = e.getNumsides()+e.getNumsides(); //adds the two methods 
         System.out.println(sum);   //displays the result
            
    }
    
}
