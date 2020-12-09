package Stringmethods;

public class StringClass2 
{
    public void lexicographical()
    {
        //string values 
        String[] words={"Devi","priya","Anusha","Jaya","ramya","Lashmi"};
        for(int i = 0; i < 6; i++) 
        {
            for (int j = i + 1; j < 6; j++) 
            {
              if (words[i].compareTo(words[j]) >=0)
               {
                 // swap words[i] with words[j]
                  String temp = words[i];
                  words[i] = words[j];
                  words[j] = temp;
               }
            }
        }
     System.out.println("In lexicographical order:");
    for(int i = 0; i < 6; i++)//print words
    {
      System.out.println(words[i]);
    }
    }
     public static void main(String[] args) 
     {
         StringClass2 sc2=new StringClass2();//object creation
         sc2.lexicographical();//calling method
     }        

}
