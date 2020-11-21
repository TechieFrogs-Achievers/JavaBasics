public class AreaOfTwoRectangles {
    int length;
    int breadth;
    AreaOfTwoRectangles(int l,int b){
        length=l;
        breadth=b;
    }
    void areaOfRectangle(){
        int area=length*breadth;
        System.out.println(area);
    }
    void perimeterofRectangle(){
        int perimeter=2*(length+breadth);
        System.out.println(perimeter);
    }
    public static void main(String[] args) {
        AreaOfTwoRectangles r=new AreaOfTwoRectangles(4, 5);
        AreaOfTwoRectangles s=new AreaOfTwoRectangles(5, 8);
        r.areaOfRectangle();
        r.perimeterofRectangle();
        s.areaOfRectangle();
        s.perimeterofRectangle();
    }
    
}
