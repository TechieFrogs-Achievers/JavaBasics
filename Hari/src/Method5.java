// Creating Super Class
class Degree 
{
    void getDegree()
    {
        System.out.println("I got a Degree");
    }
}
// Creating sub class 1
class UnderGraduate extends Degree
{
    void print()
    {
        System.out.println("I am an UnderGraduate");
    }
}
// Creating sub class 2
class PostGraduate extends Degree
{
    void print()
    {
        System.out.println("Iam a Post Graduate");
    }
}
class Method5 extends Degree
{
    public static void main(String[] args)
    {
        UnderGraduate u = new UnderGraduate();
        PostGraduate p = new PostGraduate();
        Degree d = new Degree ();
        d.getDegree();
        u.print();
        p.print();
    }
}
