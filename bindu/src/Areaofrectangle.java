public class Areaofrectangle {
    int l,b;
    void setDim(int length,int breadth) {
        l=length;
        b=breadth;
    }
    public int getArea()
    {
        int area=l*b;
        return area;
    }

    public static void main(String[] args) {
        Areaofrectangle a=new Areaofrectangle();
        a.setDim(5,4);
        System.out.println(a.getArea());
    }
}
    

    

