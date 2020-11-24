//accessModifiers example

public class AccessModifiersPracticeProgram 
{
    //private method for calculating area of rectangle inside same class
    private void area(int length, int breadth)
    {
        int area = length * breadth;
        System.out.println(area);
    }
    //private method for calculating perimeter of rectangle
    private void perimeter()
    {
        int length=4,breadth=2;
        int perimeter = 2 * (length + breadth );
        System.out.println(perimeter);
    }
    public static void main(String[] args) {
        
       
        AccessModifiersPracticeProgram a= new AccessModifiersPracticeProgram();
        a.area(5,4);
        a.perimeter();
    }
    
}
