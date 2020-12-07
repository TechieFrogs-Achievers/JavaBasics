package Stringmethods;

public class StringExample3 
{
    public static void main(String[] args) 
    {
        int count =0;
       String s = "hey! there...this is a girl?";
       for(int i=0;i<=s.length()-1;i++)//for loop to get the characters in each  strin
       {
           char ch = s.charAt(i);
           if(ch=='!'||ch=='.'||ch==','||ch=='?'||ch=='/'||ch=='@'||ch=='_'||ch=='-')//checking the pantuation points
           {
               count++;//count increases
           }
           else{
               continue;
           }
       }
       System.out.println("the pantuation count is "+count);

    }
}
