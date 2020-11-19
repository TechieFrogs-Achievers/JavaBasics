public class While {

    public static void main(String[] args) {
      /*  int i = 25;
        while(i>2)
        {
            System.out.print(i +" ");
            i--;
        }*/

        //armstrong number using Do while loop 
        int num=300,number,temp,total=0;
        number = num;
        while(number!=0)
        {
            temp = number%10;
            total = total+temp*temp*temp;
            number = number/10;
        }
        if(total==num)
        {
            System.out.println(num+" is an Armstrong number");
        }
        else
        {
            System.out.println(num+"is not an Armstrong number");
        }

        
    }

    
}
