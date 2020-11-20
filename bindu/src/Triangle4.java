public class Triangle4 {
    int p,q,r;
    Triangle4(int s1,int s2,int s3)
    {
        p=s1;
        q=s2;
        r=s3;
    }
    void Areainput()
    {
        double s=(p+q+r)/2;
        double Area=Math.sqrt(s*(s-p)*(s-q)*(s-r));
        System.out.println(Area);
    }
    void Perimeterinput()
    {
         int Perimeter=(p+q+r);
         System.out.println(Perimeter);
    }

public static void main(String[] args) {
    Triangle4 t=new Triangle4(3,4,5);
    t.Areainput();
    t.Perimeterinput();
}
}
