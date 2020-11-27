public class Triangle4 {
    int p,q,r;
    Triangle4(int s1,int s2,int s3)    //creating construcctor by using the parameters
    {
        p=s1;    //assigning values to the variables
        q=s2;
        r=s3;
    }
    void Areainput()
    {
        double s=(p+q+r)/2;       
        double Area=Math.sqrt(s*(s-p)*(s-q)*(s-r));    //using math function to print the Area 
        System.out.println(Area);
    }
    void Perimeterinput()
    {
         int Perimeter=(p+q+r);
         System.out.println(Perimeter);
    }

public static void main(String[] args)
 {
    Triangle4 t=new Triangle4(3,4,5);
    t.Areainput();
    t.Perimeterinput();  //assigning values to the method by using the object 
}

}
