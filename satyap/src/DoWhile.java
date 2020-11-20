public class DoWhile {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);



//  while Program for Palindrome
        int num=121,r=0,rem,n;
        rem=num;
        while(num>0){
          n=num%10;
          r=(r*10)+n;
          num=num/10;
        }
        if(rem==num){
        System.out.println(num+" "+" is a palindrome");
        }
        else{
        System.out.println(num+" "+"is not a palindrome");
        }
            
    

    }
    
}
