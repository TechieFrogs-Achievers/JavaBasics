public class DisplayCharacter {

        /*char c;

         for(c = 'a'; c <= 'z'; ++c)
            System.out.print(c + " ");*/
            //private char ch; 
  
            void uppercaseAlphabets() 
            { 
          
                // uppercase 
                for (int c = 65; c <= 90; ++c) 
                    System.out.print(" " + c); 
          
                System.out.print("\n"); 
            } 
            void lowercaseAlphabets() 
            { 
          
                // lowercase 
                for (int c = 97; c <= 122; ++c) 
                    System.out.print(" " + c); 
          
                System.out.print("\n"); 
            } 
          
            // Driver program 
            public static void main(String[] args) 
            { 
                System.out.println("Uppercase Alphabets"); 
                DisplayCharacter dc = new DisplayCharacter (); 
                dc.uppercaseAlphabets(); 
          
                System.out.println("Lowercase Alphabets "); 
                dc.lowercaseAlphabets(); 
            } 
        
    
}

