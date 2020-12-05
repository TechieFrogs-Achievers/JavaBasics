package Strings;

 class DigitsCounting 
{

    void diplay(String s)
    {

    
        int vowels = 0, consonants =0, space = 0, digits =0;
    
        for (int i =0;i<=s.length()-1;i++)//for loop to get the characters in each  string
        {
            
            char ch = s.charAt(i);//for getting character at i value 
    
            if (Character.isLetter(s.charAt(i)))
            {
                
                ch = Character.toLowerCase(ch);//converting each letter to lowercase
    
                if(ch=='a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                         vowels++;//vowels count increases
                }
                else 
                consonants++;//to increase the coubt
            }
    
            else  if((ch>= '0') && (ch<='9'))
            {
                    digits++;
            }
            else if (ch == ' ')
            {
                space++;
            }
            else {
                continue;
            }
        }
        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants :" + consonants);
        System.out.println("digits : " + digits);
        System.out.println("Spaces : " + space);
    }
}

public class StringsExample1 
{
    public static void main(String[] args) 
    {

        String s = "i am 20 years old ";
        DigitsCounting c = new DigitsCounting();
        c.diplay(s);
        
    }

    }
    

