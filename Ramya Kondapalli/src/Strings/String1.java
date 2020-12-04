package Strings;
class Count{

    void diplay(String s){

    
    int vowels = 0,consonants =0,space = 0,digits =0;

    for (int i =0;i<=s.length()-1;i++){
        
        char ch = s.charAt(i);   //for getting character at i value 

        if (Character.isLetter(s.charAt(i))){
            
            ch = Character.toLowerCase(ch);   //converting each letter to lowercase

            if(ch=='a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
                     vowels++;
        }
        else 
            consonants++;
    }
        //counting digits
        else  if((ch >= '0') && (ch <='9')){
                digits++;
        }
        //counting spaces
        else if (ch == ' '){
            space++;
        }
        else {
            continue; //it skips the other types inputs
        }
    }
    System.out.println("Vowels : " + vowels);
    System.out.println("Consonants :" + consonants);
    System.out.println("digits : " + digits);
    System.out.println("Spaces : " + space);
    }
}

public class String1 {
    public static void main(String[] args) {

        String s = "Techie frogs Achievers 2020 ";
        Count c = new Count();
        c.diplay(s);  //calling the method
        
    }
}
