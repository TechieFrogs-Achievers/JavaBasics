public class method {
    //create method
    public int mulNumbers(int a, int b){
        int mul = a * b;//return value
        return mul;
    }
    public static void main(String args[])
    {
        int num1 = 5;
        int num2 = 7;
        method m = new method();//create an object 
        int val=m.mulNumbers(num1,num2);
        System.out.println("mul is:" +val);

    }
    
    
}
