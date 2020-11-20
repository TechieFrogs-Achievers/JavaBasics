public class PatternAB2 {
    public static void main(String[] args) {
        //pattern 2
        char k = 'A';
        char l = 'F';
        for(k ='A'; k<='F'; k++)
        {
           for(l ='A'; l<=k; l++)
           {
               System.out.print(l+" ");
           }
           System.out.println();
       } 
       System.out.println("pattern1 is:");
       // pattern 1
         for(k ='A'; k<='F'; k++)
         {
            for(l ='A'; l<=k; l++)
            {
                System.out.print(k +" ");
            }
            System.out.println();
        } 
        System.out.println("pattern3 is:");
        //pattern 3
        for(k ='A'; k<='F'; k++)
        {
           for(l ='A'; l<=k; l++)
           {
               System.out.print(l+" ");
           }
           System.out.println();
       }
       for(k ='F'; k>='A'; k--)
        {
           for(l ='A'; l>=k; l++)
           {
               System.out.print(l +" ");
           }
           System.out.println();
       }
       System.out.println("pattern4 is:");
       //pattern 4

       for(k ='F'; k>='A'; k--)
        {
           for(l ='A'; l<=k; l++)
           {
               System.out.print(l +" ");
           }
           System.out.println();
       }
       for(k ='A'; k<='F'; k++)
        {
           for(l ='A'; l<=k; l++)
           {
               System.out.print(l+" ");
           }
           System.out.println();
       }
       System.out.println("pattern5 is:");

       // pattern5 

       for(k ='F';k>='A';k--)
       {
           for(l=k;l>='A';l--)
           {
               System.out.print(l +" ");
           }
           System.out.println();
       }
       for(k ='A';k<='F';k++)
       {
           for(l='A';l<=k;l++)
           {
               System.out.print(l +" ");
           }
           System.out.println();
       } 
    }
}
