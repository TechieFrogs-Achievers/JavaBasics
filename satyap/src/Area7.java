public class Area7 {
    int l,b;
    Area7(int length,int breadth){
        l=length;
        b=breadth;

    }
    int returnArea(){
        int area=l*b;
        return area;
    }
    public static void main(String[] args) {
        Area7 a=new Area7(10, 20);
        System.out.println(a.returnArea());

    }
    
}
