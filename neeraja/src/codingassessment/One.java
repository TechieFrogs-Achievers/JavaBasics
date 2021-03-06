package codingassessment;

class Palindrome{

//function to find the word s palindrome or not
 void palindrom(String arr1) {
    //logic to find given word is palindrome 
    String arr2=arr1;
    String reversedStr="";
    for (int i = arr1.length() - 1; i >= 0; i--) {
         reversedStr = reversedStr + arr1.charAt(i);
    } 
    //if word is palindrome print that word
    if(arr2.equals(reversedStr)){
        System.out.println(arr2+" is a palindrome");
    }
  }
}

//driver class /driver code
public class One {
    public static void main(String[] gh){
        //input string
        String str="clock is madam for everyone";
        String[] arr1=str.split(" ");
       //instantiation of class palindrome
        Palindrome p=new Palindrome();
        
        //calling function inside an iterator
        for(int i=0;i<arr1.length;i++){
            p.palindrom(arr1[i]);
        }

        
    }
    
}
