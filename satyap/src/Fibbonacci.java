public class Fibbonacci {
    public static void main(String[] args) {
        int num1=0,num2=1,num3,count=10;
        System.out.println(num1+" "+num2);
        for(int i=2;i<count;i++){
            num3=num1+num2;
            System.out.println(" "+num3);
            num1=num2;
            num2=num3;
        }
    }
    
}
