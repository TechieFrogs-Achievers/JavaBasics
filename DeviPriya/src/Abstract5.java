abstract class Animal1
{
    abstract void cat();
    abstract void dog();

}
class Cat5 extends Animal1{
    void cat()
    {
        System.out.println("cat meows");
    }

}
class Dog5 extends Animal1{
    void dog()
    {
        System.out.println("Dogs bark");
    }

}
public class Abstract5 {
    public static void main(String[] args) 
    {
        Cat5 c = new Cat5();
        c.cat();
        Dog5 d = new Dog5();
        d.dog();
    }

    
}
