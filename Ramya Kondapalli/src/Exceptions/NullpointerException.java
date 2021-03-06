package Exceptions;

public class NullpointerException {
    public static void main(String[] args) {
        String s = null;

        try{
            System.out.println(s.length());
        }
        catch(NullPointerException n){

            System.out.println("Null Pointer Exception");
        }
    }
}
