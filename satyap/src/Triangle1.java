public class Triangle1 {
    int a;
    int b;
    int c;
    Triangle1(int s1,int s2,int s3){
        a=s1;
        b=s2;
        c=s3;
    }
    void getArea(int a,int b,int c){

        int s=(a+b+c)/2;
       int  area=s*(s-a)*(s-b)*(s-c);
        System.out.println(area);
    }
    void areaOfPerimeter(int a,int b,int c){
        int perimeter=(a+b+c);
        System.out.println(perimeter);
    }
    public static void main(String[] args) {
        Triangle1 tr=new Triangle1(2,3,4);
        tr.areaOfPerimeter(2,3,4);
        tr.getArea(2,3,4);
    }
}
