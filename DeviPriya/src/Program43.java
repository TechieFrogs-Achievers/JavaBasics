public class Program43 {
    public static void main(String[] args){  
        int ch =65;
        for(int i=1;i<6;i++)
        {
            for (int j=1;j<7;++j)
            {
                if(i>=j)
                System.out.print(i);
                else
                System.out.print(((char)(ch+i-1)));

            }
            System.out.println();
        }
    }



    
}
