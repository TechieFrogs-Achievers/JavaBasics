
public class AreaOfRectangle{
    void setDim(int length,int breadth){
        System.out.println(length+" "+breadth);
    
    }
    void getArea(int length,int breadth)
    {
        System.out.println("area"+" "+ length*breadth);
        
    }
    public static void main(String[] args) {
    
        AreaOfRectangle a=new AreaOfRectangle();
        a.setDim(5,6);
        a.getArea(5,6);
    }
    
}
