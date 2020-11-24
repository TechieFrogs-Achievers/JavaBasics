import java.util.Scanner;

class Area {
    int length,breadth;
    
    //method to intialise parameters
    public void setDim(int x,int y) { 
        length = x;
        breadth = y;
    }

    //method to print area
    public int getArea() {
        return length * breadth;
    }
}

public class ConstructorProgram6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  //Dynamic inputs
        int a = s.nextInt();
        int b = s.nextInt();
        Area r = new Area();
        r.setDim(a,b); //passing parameters
        System.out.println("Area of Reactangle : " +  r.getArea());
    }
}
