package Strings;

class LexicographicalOrder
{
    void showOrder()
    {
        String[] str={"My","Name","Is","Durga","Lakshmi"};
        for(int i = 0;i< 5;i++)
        {
        for (int j=i+1;j<5;j++)
        {
        if(str[i].compareTo(str[j])>0)
        {          
            String temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        }
        }
        for (int i = 0;i<5;i++)
        {
          System.out.println(str[i]);
        }
        }
    }
    public class StringsExample2 
    {
        public static void main(String[] args) 
        {
           LexicographicalOrder obj = new  LexicographicalOrder();
           obj.showOrder();
        }
    }
    

