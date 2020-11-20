public class Triangle {
    int s;
    int a;
    int b;
    int c;
    
    void areaOfTriangle(int a,int b,int c){
        int area;
        s=(a+b+c)/2;
        area=s*(s-a)*(s-b)*(s-c);
        System.out.println(area);
    }
    void areaOfPerimeter(int a,int b,int c){
        
        int perimeter;
        perimeter=a+b+c;
        System.out.println(perimeter);
    }
    int i;
    Triangle(){
        double var=i;
        System.out.println(var);
        System.out.println("Default constructor ");
    }
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.areaOfTriangle(3,4,5);
        t1.areaOfPerimeter(3,4,5);
    }
}
    
        
