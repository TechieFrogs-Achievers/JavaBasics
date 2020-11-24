package Assignment4;
class Apple
{
    //it consists only on data member
    public int num_of_items =52;
}
//it extending parent class data member
class Banana extends Apple{
    int num_of_items;
    //constructor
    public Banana(int x){
        num_of_items = x;
    }
    //method to print data members in both classes
    void show(){
        System.out.println(super.num_of_items);
        System.out.println(num_of_items);
    }
}
public class Inheritence9 {
    public static void main(String[] args) {
    Apple a = new Apple();
    Banana b = new Banana(34);
    b.show();//calling method in child class
    }
}
