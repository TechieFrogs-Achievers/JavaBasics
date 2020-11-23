public class IfElseLadder
{
    public void ifelseExample()
    {
        int num1=  32, num2 = 143, num3 = 75;
        if((num1 > num2) && (num1 > num3)) //check 2 condition 
            System.out.println( "num1 is greater");

        else if ((num2 > num1 ) && (num2 > num3 )) //else if checks 2 conditions
            System.out.println( "num2 is greater");

        else 
            System.out.println("num3 is Greater");
    }

    public static void main(String args[]) throws ClassNotFoundException {

        IfElseLadder obj = new IfElseLadder();//creating obj to class
        obj.ifelseExample();  //output -- num2 is greater
        
    }
}

