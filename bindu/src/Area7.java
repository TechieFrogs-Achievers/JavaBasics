public class Area7 {
    int l,b;
    Area7(int length, int breadth)
    {
        l=length;
        b=breadth;
    }
    public int returnArea7()
    {
        int area =l*b;
        return area;
    }

public static void main(String[] args) {
    Area7 ar=new Area7(15,20);
    System.out.println(ar.returnArea7());
}

}

