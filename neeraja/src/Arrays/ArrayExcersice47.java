package Arrays;

public class ArrayExcersice47 {
    public static void main(String[] j){

        //converting single charecter to string
    char c='a';
    String s1=String.valueOf(c);//using valueof method
    System.out.println("String is "+s1);//c

    //converting charecters to string
    char[] ch={'a','s','a','s'};
    String s2=String.valueOf(ch);//using value of method
    String s4=new String(s2);
    System.out.println("String is "+s2);
    System.out.println("String is "+s4);

    //converting string to array/charecters
    String s3="this is car";
    char[] k=s3.toCharArray();//using tochararray method
    for(int i=0; i<k.length; i++){
    System.out.print(" "+k[i]);
    }
    
}
}