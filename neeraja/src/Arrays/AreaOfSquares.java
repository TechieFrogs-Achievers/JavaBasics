package Arrays;

import java.util.Scanner;

class Square 
{
        int side;
        int perimeter ;
        int area;
         public Square(float length, int width, int side2) {
		}
		//method to  calcuate area of square
         public float squareArea(int z)
         {
             area = side * side;
            //System.out.println(area);
            return area;
         }
         //method to  calcuate perimeter of square
         public float squarePerimeter(float x,int y)
         {
              perimeter = 4 * side;
             //System.out.println(perimeter);
             return perimeter;
         }

        
}



//driver classs
public class AreaOfSquares {

    public static void main(String[] w){
       
 
        Square[] s1=new Square[10];//creating array of objects
        int i=0;
        float length=0;
        int width=0,side=0;
        Scanner scan=new Scanner(System.in);

       
            for( i=0;i<s1.length;i++){
            System.out.println("enter parameters length,width,side");
            
             length=scan.nextFloat();
             width=scan.nextInt();
             side=scan.nextInt(); 
            s1[i]=new Square(length,width,side);
            //s1[i].squareArea(side);
            
         }       
         
          for(i=0;i<s1.length;i++){
            float f = s1[i].squareArea(side);
           float f1= s1[i].squarePerimeter(length,width);
           System.out.println(i+" th square area and perimeters are "+f+ "\n"+ f1);
           //s1[i].display();
        }
        scan.close();
 }
      
    }
    
