//example for else if ladder
public class ElseIfLadder {

    public void findingHouse(int floors, int rooms)
    {
        if(floors <= 2 && floors >=0)           //if condition
        {
            System.out.println("The rent for house is 6000 per month");
        }
        else if(floors <=6 && rooms >= 3 && rooms ==2 && rooms >= 4)        //else if condition
        {
            System.out.println("The rent for this house is 8000 per month");
        }
        else if(floors >=7 && floors <= 10 && rooms <=6)
        {
            System.out.println("The rent for this house is 15000 per month" );
        }
        else if(floors >= 10  && floors <= 20 )
        {
            System.out.println("The rent for this house is 25000 per month");
        }
        else                                                                    //else condition
        {
            System.out.println("Please give valid information");
        }
    }
    

    
    public void findingGreatestNumber()
    {
        int number1=50, number2= 25,number3= 60;

        if(number1 >= number2 && number1 >= number3)
        {
            System.out.println(number1 +"is the greastest number in all the three numbers");
        }
        else if(number2 >= number1 && number2 >= number3)
        {
            System.out.println(number2 +"is the greatest number in all the three numbers");
        }
        else
        {
            System.out.println(number3 +"is the greatest number in all the three numbers");
        }
    }

    public static void main(String[] args) {
        ElseIfLadder ei = new ElseIfLadder();
        ei.findingGreatestNumber();
        ei.findingHouse(10, 6);
    }
    
}
