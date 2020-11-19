public class NShapePattern {              
        public static void main(String[] args) 
        {
                int n=1;
                for(int i=1;i<=6;i++)
                {
                        System.out.println();
                        for (int j=1;j<=6;j++)
                        {
                                if(i==j || j==6 || j==1){
                                System.out.print(n  + " ");
                                
                                }
                                else 
                                System.out.print("  ");
                        }
                        n++;
                }
        }
}