package Assignment4;
class Integer{
    int i;
    //parent class 
    void printNum(){
        System.out.println(i);
    }
}
class Integer2 extends Integer{
    int j;
    //child class
    void printNum(){
        System.out.println(j);
    }
}
class MethodExcercise7 {
    public static void main(String[] args) {
        Integer2 obj2 = new Integer2();
        obj2.i=3;
        obj2.j=4;
        obj2.printNum();//it will print child class method
    }
}
