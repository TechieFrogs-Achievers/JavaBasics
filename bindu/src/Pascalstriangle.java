public class Pascalstriangle {
    public static void main(String[] args) {
        int k =5,num=1,m,n;
        int value =k;
        for(m=0;m<k;m++)
        {
            for(n=1;n<value;n++)
            {
                System.out.print(" ");
            }
            num=1;
            for(int p=0;p<=m;p++)
            {
                System.out.print(num +" ");
                num = num*(m-p)/(p+1);
            }
            value--;
            System.out.println();

        }

        
    }
    
}
