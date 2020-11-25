package Assignment4;

class Degree{
    //parent class
    void getDegree(String degree){
      System.out.println(degree);
    }
}
    //two child classes extending the same class i.e., parent class
    class UnderGraduate extends Degree{
        public void display(){
            getDegree("I am UnderGraduate");
        }
    }
    class PostGraduate extends Degree{
        public void display(){
            getDegree("I am Post Graduate");
        }
    }

public class MethodExercise5 {
    public static void main(String[] args) {
        Degree d= new Degree();
        UnderGraduate u = new UnderGraduate();
        PostGraduate p= new PostGraduate();
        d.getDegree("I got Degree");
        //methods calling by different objects
        u.display();
        p.display();
    }
}
