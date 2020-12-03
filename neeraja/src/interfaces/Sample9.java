package interfaces;

//circle interface
interface Circle{
    int radius=5;
    String colour="blue";

}
//rectangle interface
interface Rectangle{
    float lenght=8;
    double breadth=20.63;
    String colour="red";
}
//shapes interface
interface Shapes{
     void fixedText(String text);

}
//signs interface
interface Signs {
    void shape(String str);

}

//class implementing all interfacesat atime
class Q implements Circle,Rectangle,Shapes,Signs{

    //implementing abstract methods
    public void shape(String str){
        System.out.println("you selected "+str+"as shape in sign");
    }

    //implementing abstract methods
    public void fixedText(String text){
        String len=text;
       int str_length =len.length();
       if(lenght>=str_length && radius>=str_length){
           System.out.println("given text will be fitted in the sign");
       }
       else{
        System.out.println("given text will not be fitted in the sign");
       }

    }
}


//Driver class
public class Sample9 {
    public static void main(String[] jn){
        //instantiation of class Q
        Q q=new Q();
        q.shape("circle");
        q.fixedText("take left");
    }
    
}
